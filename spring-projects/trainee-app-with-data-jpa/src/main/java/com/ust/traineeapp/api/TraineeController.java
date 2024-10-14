package com.ust.traineeapp.api;

import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://127.0.0.1:5500"})
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

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Trainee getTrainee(@PathVariable("id") int id){
        return traineeService.getTraineeById(id);
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Trainee> getAllTrainees(){
        return traineeService.getAllTrainees();
    }



    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Trainee updateTrainee(@PathVariable int id,@RequestBody Trainee trainee){
        return traineeService.updateTrainee(id,trainee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrainee(@PathVariable int id){
        traineeService.deleteTrainee(id);
    }

    @GetMapping("/search")
    @ResponseStatus(code = HttpStatus.OK)
    public Trainee findTraineeByName(@RequestParam("name") String name)
    {
        return traineeService.findTraineeByName(name);
    }

    @GetMapping("/month/{month}/year/{year}")
    public List<Trainee> findTraineeByMonthAndYear(@PathVariable int month,
                                                   @PathVariable int year){
        return traineeService.findTraineeByMonthAndYear(month, year);
    }


}
