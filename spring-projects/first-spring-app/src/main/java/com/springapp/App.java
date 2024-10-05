package com.springapp;

import com.springapp.beans.Phone;
import com.springapp.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Phone phone = context.getBean(Phone.class);
        String phnNo = "7826282929";
        phone.call(phnNo);
        phone.sendText(phnNo,"Hello.. When are you reaching?");

        System.out.println("Phone Details : ");
        System.out.println(phone);
        Phone phone2 = context.getBean(Phone.class);
        Phone phone3 = context.getBean(Phone.class);
    }
}
