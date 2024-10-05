package com.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Sim {

    public Sim() {
        System.out.println("Sim Bean Created");
    }

    @Autowired
    private Network network;

    private String providerName;

    public void call(String phnNo){
        if (network.isAvailable())
            System.out.println("Calling "+phnNo);
        else
            System.out.println("Couldn't make a call due to network issues");
    }

    public void sendText(String phnNo, String message){
        if (network.isAvailable())
         System.out.println("""
                                Sent
                                [
                                 %s
                                ]
                                to %s
                            """.formatted(message,phnNo));

        else
            System.out.println("Couldn't send the text due to network issues");


    }

}
