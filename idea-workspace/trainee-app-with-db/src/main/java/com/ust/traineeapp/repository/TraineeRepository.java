package com.ust.traineeapp.repository;

import com.ust.traineeapp.model.Trainee;

import java.util.List;

public interface TraineeRepository {

    public Trainee save(Trainee trainee);

    public Trainee getTrainee(int id);

    public List<Trainee> getAllTrainees();

    public void deleteTrainee(int id);

}
