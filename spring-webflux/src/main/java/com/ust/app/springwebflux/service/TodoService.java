package com.ust.app.springwebflux.service;

import com.ust.app.springwebflux.dto.Status;
import com.ust.app.springwebflux.dto.Task;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@Service
public class TodoService {

    List<Task> taskList = List.of(
            new Task(1, "Create Spring Boot Application", Status.COMPLETED),
            new Task(2, "Learn Angular", Status.COMPLETED),
            new Task(3, "Learn Python", Status.PENDING),
            new Task(4, "Learn React", Status.PENDING)
    );


    public Flux<Task> getAllTasksReactive() {
        return Flux.fromIterable(taskList)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(t -> System.out.println(t.title() + " Fetched"));


    }

    public Mono<Task> getTaskById(int id) {
        return Mono.fromSupplier(() ->
                taskList.stream().filter(t -> t.id() == id)
                        .findFirst().get());
    }

}
