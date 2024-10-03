package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeServiceImpl implements TraineeService{

    @Autowired
    private TraineeRepository traineeRepository;

    public void saveTrainee(Trainee trainee) {
        traineeRepository.save(trainee);
    }

    public List<Trainee> getAllTrainees() {
        return traineeRepository.getAllTrainees();
    }

    public Trainee getTraineeById(int id) {
        return traineeRepository.getTrainee(id);
    }
}
