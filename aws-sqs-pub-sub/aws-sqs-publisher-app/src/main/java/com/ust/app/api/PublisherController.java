package com.ust.app.api;

import com.ust.app.model.Message;
import com.ust.app.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @PostMapping
    public String publishMessage(@RequestBody Message message) {
        publisherService.publishMessage(message);
        return "Message published successfully";
    }

}
