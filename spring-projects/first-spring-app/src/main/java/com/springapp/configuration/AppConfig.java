package com.springapp.configuration;

import com.springapp.beans.Phone;
import com.springapp.beans.Sim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Sim getSimBean(){
        return new Sim();
    }

    @Bean
    public Phone getPhoneBean(){
        return new Phone();
    }

}
