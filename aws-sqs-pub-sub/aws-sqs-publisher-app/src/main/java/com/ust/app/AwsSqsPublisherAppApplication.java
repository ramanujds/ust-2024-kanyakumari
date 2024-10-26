package com.ust.app;

import com.ust.app.service.PublisherService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AwsSqsPublisherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsSqsPublisherAppApplication.class, args);


	}



}
