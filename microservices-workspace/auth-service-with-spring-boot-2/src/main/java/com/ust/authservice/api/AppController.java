package com.ust.authservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/app")
public class AppController {
    @GetMapping
    public String sayHello(){
        return "Hello from UST";
    }

    @GetMapping("/admin")
    public String sayHelloAdmin(){
        return "Hello from UST Admin";
    }

}
