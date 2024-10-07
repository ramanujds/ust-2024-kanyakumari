package com.ust.webapp.repository;

import com.ust.webapp.model.Trainee;

import java.util.List;

public interface TraineeRepository {

    public Trainee save(Trainee trainee);

    public Trainee getTrainee(int id);

    public List<Trainee> getAllTrainees();

    public void deleteTrainee(int id);

    public Trainee getTraineeByName(String name);

    public Trainee updateTrainee(int id, Trainee trainee);

}
