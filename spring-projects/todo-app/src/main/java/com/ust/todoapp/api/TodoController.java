package com.ust.todoapp.api;

import com.ust.todoapp.model.Task;
import com.ust.todoapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/api/v1/todos")
public class TodoController {

    @Autowired
    TaskRepository taskRepo;

    @PostMapping
    public Task createTask(@RequestBody Task task){
       return taskRepo.save(task);
    }

    @GetMapping
    public List<Task> fetchAllTasks(){
        return taskRepo.findAll();
    }

}
