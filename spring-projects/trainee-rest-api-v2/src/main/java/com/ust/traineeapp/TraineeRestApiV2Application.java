package com.ust.traineeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class TraineeRestApiV2Application {

	public static void main(String[] args) {
		SpringApplication.run(TraineeRestApiV2Application.class, args);
	}

}
