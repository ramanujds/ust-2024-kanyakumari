package com.springapp.beans;

import org.springframework.stereotype.Component;

@Component
public class Sim {

    public void call(String phnNo){
        System.out.println("Calling "+phnNo);
    }

    public void sendText(String phnNo, String message){
        System.out.println("""
                                Sent
                                [
                                 %s
                                ]
                                to %s
                            """.formatted(message,phnNo));

    }

}
