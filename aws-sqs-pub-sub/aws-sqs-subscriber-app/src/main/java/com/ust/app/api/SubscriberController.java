package com.ust.app.api;

import com.ust.app.model.Message;
import com.ust.app.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    @GetMapping("/message")
    public Message getMessage() {
        return subscriberService.consumeMessages();
    }


}
