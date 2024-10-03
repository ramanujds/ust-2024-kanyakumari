package com.ust.traineeapp.repository;

import com.ust.traineeapp.model.Trainee;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TraineeRepositoryCollectionBasedImpl implements TraineeRepository{

    List<Trainee> traineeList = new ArrayList<>();

    public Trainee save(Trainee trainee) {
        traineeList.add(trainee);
        return trainee;
    }

    public Trainee getTrainee(int id) {
        return null;
    }

    public List<Trainee> getAllTrainees() {
        return List.of();
    }

    public void deleteTrainee(int id) {

    }
}
