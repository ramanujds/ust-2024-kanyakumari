package com.ust.app.springwebflux.api;

import com.ust.app.springwebflux.dto.Status;
import com.ust.app.springwebflux.dto.Task;
import com.ust.app.springwebflux.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
@CrossOrigin
public class TodoApi {

    @Autowired
    private TodoService service;

    List<Task> taskList = List.of(
            new Task(1, "Create Spring Boot Application", Status.COMPLETED),
            new Task(2, "Learn Angular", Status.COMPLETED),
            new Task(3, "Learn Python", Status.PENDING),
            new Task(4, "Learn React", Status.PENDING)
    );


//    @GetMapping
//    public List<Task> getAllTasks() throws InterruptedException {
//        return taskList.stream()
//                .peek((t) -> {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                })
//                .toList();
//    }

    @GetMapping(produces = "text/event-stream")
    public Flux<Task> getAllTasksReactive() {
        return service.getAllTasksReactive();
    }

    @GetMapping("/{id}")
    public Mono<Task> getTaskById(@PathVariable int id){
       Task t = taskList.get(0);
       return Mono.just(t);
    }

}
