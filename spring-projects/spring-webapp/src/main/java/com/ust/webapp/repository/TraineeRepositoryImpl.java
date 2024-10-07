package com.ust.webapp.repository;

import com.ust.webapp.model.Trainee;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TraineeRepositoryImpl implements TraineeRepository {

    List<Trainee> traineeList;

    @PostConstruct
    void init(){
       traineeList = new ArrayList<>();
       Trainee t1 = new Trainee(1,"Harsh","Bangalore");
       Trainee t2 = new Trainee(2,"Karan","Chennai");
       traineeList.add(t1);
       traineeList.add(t2);
    }

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
