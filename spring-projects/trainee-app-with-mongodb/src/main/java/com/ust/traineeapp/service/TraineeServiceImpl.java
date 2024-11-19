package com.ust.traineeapp.service;

import com.ust.traineeapp.model.Trainee;
//import com.ust.traineeapp.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class TraineeServiceImpl implements  TraineeService{

//    @Autowired
//    private TraineeRepository traineeRepo;

    @PreAuthorize("hasRole('ADMIN')")
    public Trainee saveTrainee(Trainee trainee) {
//        if (trainee.getId()!=null && traineeRepo.existsById(trainee.getId())){
//            throw new RuntimeException("Trainee with ID : "+trainee.getId()+" Already Present");
//        }
//        return traineeRepo.save(trainee);
        return trainee;
    }

//    public Trainee findTraineeById(BigInteger id) {
//        return traineeRepo.findById(id).orElse(null);
//    }
//
//    public void removeTrainee(BigInteger id) {
//        traineeRepo.deleteById(id);
//    }
//
//    @PreAuthorize("hasRole('USER')")
//    public List<Trainee> getAllTrainees() {
//        return traineeRepo.findAll();
//    }
//
//    public Trainee updateTrainee(BigInteger id, Trainee trainee) {
//        if (!traineeRepo.existsById(id)){
//            throw new RuntimeException("Trainee with ID : "+trainee.getId()+" Not Found");
//        }
//        return traineeRepo.save(trainee);
//    }
}
