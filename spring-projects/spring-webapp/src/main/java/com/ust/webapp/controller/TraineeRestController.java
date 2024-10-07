package com.ust.webapp.controller;

import com.ust.webapp.model.Trainee;
import com.ust.webapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trainees")
public class TraineeRestController {

    @Autowired
    private TraineeService traineeService;

    @GetMapping("/{id}")
    public Trainee getTrainee(@PathVariable("id") int id){
        return traineeService.getTrainee(id);
    }

    @GetMapping
    public List<Trainee> getAllTrainees(){
        return traineeService.getAllTrainees();
    }

    @PostMapping
    public Trainee saveTrainee(@RequestBody Trainee trainee){
        return traineeService.save(trainee);
    }

}
