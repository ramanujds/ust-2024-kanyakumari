package com.ust.traineeapp.api;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/api/v1/trainees")
public class TraineeController {


    @Autowired
    private TraineeService traineeService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Trainee saveTrainee(@RequestBody Trainee trainee){
        return traineeService.saveTrainee(trainee);
    }

//    @GetMapping("/{id}")
//    @ResponseStatus(code = HttpStatus.OK)
//    public Trainee getTrainee(@PathVariable("id") BigInteger id){
//        return traineeService.findTraineeById(id);
//    }


//    @GetMapping
//    @ResponseStatus(code = HttpStatus.OK)
//    public List<Trainee> getAllTrainees(){
//        return traineeService.getAllTrainees();
//    }
//
//    @PutMapping("/{id}")
//    @ResponseStatus(code = HttpStatus.ACCEPTED)
//    public Trainee updateTrainee(@PathVariable BigInteger id,@RequestBody Trainee trainee){
//        return traineeService.updateTrainee(id,trainee);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteTrainee(@PathVariable BigInteger id){
//        traineeService.removeTrainee(id);
//    }
//
//


}
