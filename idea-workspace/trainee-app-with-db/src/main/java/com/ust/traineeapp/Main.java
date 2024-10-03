package com.ust.traineeapp;

import com.ust.traineeapp.configuration.TraineeAppConfig;
import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeRepository;
import com.ust.traineeapp.repository.TraineeRepositoryImpl;
import com.ust.traineeapp.service.TraineeService;
import com.ust.traineeapp.service.TraineeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(TraineeAppConfig.class);

        TraineeService service = context.getBean(TraineeServiceImpl.class);

        service.getAllTrainees().forEach(t-> System.out.println(t));


    }
}