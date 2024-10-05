package com.ust.webapp.service;

import com.ust.webapp.model.Trainee;
import com.ust.webapp.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraineeServiceImpl implements TraineeService{

    @Autowired
    private TraineeRepository traineeRepo;

    public Trainee save(Trainee trainee) {
        return traineeRepo.save(trainee);
    }

    public Trainee getTrainee(int id) {
        return traineeRepo.getTrainee(id);
    }

    public List<Trainee> getAllTrainees() {
        return traineeRepo.getAllTrainees();
    }

    public void deleteTrainee(int id) {
        traineeRepo.deleteTrainee(id);
    }
}
