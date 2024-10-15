package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TraineeServiceImpl implements  TraineeService{

    @Autowired
    private TraineeRepository traineeRepo;

    public Trainee saveTrainee(Trainee trainee) {
        if (traineeRepo.existsById(trainee.getId())){
            throw new RuntimeException("Trainee with ID : "+trainee.getId()+" Already Present");
        }
        return traineeRepo.save(trainee);
    }

    public Trainee findTraineeById(int id) {
        return traineeRepo.findById(id).orElse(null);
    }

    public void removeTrainee(int id) {
        traineeRepo.deleteById(id);
    }

    public List<Trainee> getAllTrainees() {
        return traineeRepo.findAll();
    }

    public Trainee updateTrainee(int id, Trainee trainee) {
        if (!traineeRepo.existsById(trainee.getId())){
            throw new RuntimeException("Trainee with ID : "+trainee.getId()+" Not Found");
        }
        return traineeRepo.save(trainee);
    }
}
