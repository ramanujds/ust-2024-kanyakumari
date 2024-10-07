package com.ust.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalTime;

@Controller
public class AppController {

    @PostMapping("/hello")
    public ModelAndView sayHello(@RequestParam("username") String name){
        System.out.println(name);
        String time = LocalTime.now().toString();
        ModelAndView mv = new ModelAndView("hello.jsp");
        mv.addObject("time",time);
        mv.addObject("username",name);
        return mv;
    }

    @GetMapping("/")
    public String getIndexPage(){
        return "index.jsp";
    }

    @GetMapping("/api")
    public String getSwaggerApi(){
        return "/swagger-ui.html";
    }



}
