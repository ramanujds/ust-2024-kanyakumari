package com.ust.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;

@Controller
public class AppController {

    @GetMapping("/hello")
    public String sayHello(Model m, @RequestParam("username") String name){
        System.out.println(name);
        String time = LocalTime.now().toString();
        m.addAttribute("time",time);
        m.addAttribute("username",name);
        return "hello.jsp";
    }



}
