package com.ust.webapp.repository;

import com.ust.webapp.model.Trainee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TraineeRepositoryImpl implements TraineeRepository{

    List<Trainee> traineeList = new ArrayList<>();

    public Trainee save(Trainee trainee) {
        traineeList.add(trainee);
        return trainee;
    }

    public Trainee getTrainee(int id) {
        return traineeList.stream().filter(t->t.id()==id).findFirst().get();
    }

    public List<Trainee> getAllTrainees() {
        return traineeList;
    }

    public void deleteTrainee(int id) {
        traineeList.removeIf(t->t.id()==id);
    }
}
