package com.ust.webapp.controller;

import com.ust.webapp.dto.TraineeDto;
import com.ust.webapp.model.Trainee;
import com.ust.webapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trainees")
public class TraineeRestController {

    @Autowired
    private TraineeService traineeService;

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public TraineeDto getTrainee(@PathVariable("id") int id){
        return traineeService.getTrainee(id);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<TraineeDto> getAllTrainees(){
        return traineeService.getAllTrainees();
    }

    @PostMapping
//    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<TraineeDto> saveTrainee(@RequestBody TraineeDto trainee){
        TraineeDto savedTrainee = traineeService.save(trainee);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTrainee);

    }


    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public TraineeDto updateTrainee(@PathVariable int id,@RequestBody TraineeDto trainee){
        return traineeService.updateTrainee(id,trainee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrainee(@PathVariable int id){
        traineeService.deleteTrainee(id);
    }

    @GetMapping("/search")
    @ResponseStatus(code = HttpStatus.OK)
    public TraineeDto findTraineeByName(@RequestParam("name") String name)
    {
        return traineeService.findTraineeByName(name);
    }

}
