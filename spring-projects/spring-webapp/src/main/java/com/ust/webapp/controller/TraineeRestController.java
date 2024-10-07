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


    @PutMapping("/{id}")
    public Trainee updateTrainee(@PathVariable int id,@RequestBody Trainee trainee){
        return traineeService.updateTrainee(id,trainee);
    }

    @DeleteMapping("/{id}")
    public void deleteTrainee(@PathVariable int id){
        traineeService.deleteTrainee(id);
    }

    @GetMapping("/search")
    public Trainee findTraineeByName(@RequestParam("name") String name)
    {
        return traineeService.findTraineeByName(name);
    }

}
