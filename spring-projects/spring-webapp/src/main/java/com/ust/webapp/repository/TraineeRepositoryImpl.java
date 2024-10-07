package com.ust.webapp.repository;

import com.ust.webapp.model.Trainee;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Optional<Trainee> getTrainee(int id) {
        return traineeList.stream().filter(t->t.getId()==id).findFirst();
    }

    public List<Trainee> getAllTrainees() {
        return traineeList;
    }

    public void deleteTrainee(int id) {
        traineeList.removeIf(t->t.getId()==id);
    }

    public Trainee updateTrainee(int id, Trainee trainee) {
        Trainee savedTrainee = getTrainee(id).orElseThrow();
        savedTrainee.setName(trainee.getName());
        savedTrainee.setLocation(trainee.getLocation());
        return savedTrainee;
    }

    public Optional<Trainee> getTraineeByName(String name){
        return traineeList.stream().filter(t->t.getName().toLowerCase().contains(name.toLowerCase())).findFirst();
    }

}
