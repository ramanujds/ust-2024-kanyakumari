package com.ust.traineeapp;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeRepository;
import com.ust.traineeapp.repository.TraineeRepositoryImpl;
import com.ust.traineeapp.util.JdbcConnectionUtil;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {





        TraineeRepository repository = new TraineeRepositoryImpl();
//
////        Trainee trainee = new Trainee(0,"Gautham","Bengaluru", LocalDate.of(2024,8,11));
////
////        repository.save(trainee);
//
        repository.getAllTrainees().forEach(t-> System.out.println(t));


    }
}