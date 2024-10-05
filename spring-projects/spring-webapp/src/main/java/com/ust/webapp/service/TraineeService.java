package com.ust.webapp.service;

import com.ust.webapp.model.Trainee;

import java.util.List;

public interface TraineeService {

    public Trainee save(Trainee trainee);

    public Trainee getTrainee(int id);

    public List<Trainee> getAllTrainees();

    public void deleteTrainee(int id);
}
