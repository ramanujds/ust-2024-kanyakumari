package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;


import java.util.List;

public interface TraineeService {

    Trainee saveTrainee(Trainee trainee);

    Trainee getTraineeById(int id);

    void deleteTrainee(int id);

    List<Trainee> getAllTrainees();

    Trainee updateTrainee(Trainee trainee);

}
