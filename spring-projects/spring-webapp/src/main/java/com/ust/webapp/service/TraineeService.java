package com.ust.webapp.service;

import com.ust.webapp.dto.TraineeDto;
import com.ust.webapp.model.Trainee;

import java.util.List;

public interface TraineeService {

    public TraineeDto save(TraineeDto trainee);

    public TraineeDto getTrainee(int id);

    public List<TraineeDto> getAllTrainees();

    public void deleteTrainee(int id);

    public TraineeDto findTraineeByName(String name);

    public TraineeDto updateTrainee(int id, TraineeDto trainee);


}
