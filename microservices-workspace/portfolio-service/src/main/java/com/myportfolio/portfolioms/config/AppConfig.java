package com.myportfolio.portfolioms.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    @LoadBalanced
    @Primary
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean("basicRestTemplate")
//    public RestTemplate getBasicRestTemplate(){
//        return new RestTemplate();
//    }

}
