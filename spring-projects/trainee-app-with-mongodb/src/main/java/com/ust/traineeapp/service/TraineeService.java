package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;

import java.util.List;

public interface TraineeService {

    Trainee saveTrainee(Trainee trainee);

    Trainee findTraineeById(int id);

    void removeTrainee(int id);

    List<Trainee> getAllTrainees();

    Trainee updateTrainee(int id, Trainee trainee);


}
