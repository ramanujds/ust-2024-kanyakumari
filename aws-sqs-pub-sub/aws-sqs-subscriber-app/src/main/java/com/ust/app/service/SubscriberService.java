package com.ust.app.service;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ust.app.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class SubscriberService {

    @Value("${aws.queueName}")
    private String queueName;

    private final AmazonSQS amazonSQSClient;

    public SubscriberService(AmazonSQS amazonSQSClient) {
        this.amazonSQSClient = amazonSQSClient;
    }


    public Message consumeMessages() {
        try {
            String queueUrl = amazonSQSClient.getQueueUrl(queueName).getQueueUrl();

            ReceiveMessageResult receiveMessageResult = amazonSQSClient.receiveMessage(queueUrl);

            if (!receiveMessageResult.getMessages().isEmpty()) {
                com.amazonaws.services.sqs.model.Message message = receiveMessageResult.getMessages().get(0);
                log.info("Read Message from queue: {}", message.getBody());
                amazonSQSClient.deleteMessage(queueUrl, message.getReceiptHandle());
                return convertToMessage(message.getBody());
            }
        } catch (Exception e) {
            log.error("Queue Exception Message: {}", e.getMessage());
        }
        return null;
    }


    public Message convertToMessage(String message) {
        try {
            return new ObjectMapper().readValue(message, Message.class);
        } catch (Exception e) {
            log.error("Error while converting message to object: {}", e.getMessage());
        }
        return null;
    }



}
