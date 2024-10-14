package com.ust.traineeapp.service;

import com.ust.traineeapp.exception.RecordNotFoundException;
import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class TraineeServiceImplTest {

    @Mock
    TraineeRepository traineeRepository;

    @InjectMocks
    TraineeServiceImpl traineeService;

    @Test
    void getTraineeById() {

        // Given
        var id = 1;
        var invalidId = 100;
        Trainee trainee = new Trainee(1,"Umesh","Gurgaon", LocalDate.now());

        // When
        Mockito.when(traineeRepository.findById(Mockito.anyInt()))
                        .thenReturn(Optional.of(trainee));

        Mockito.when(traineeRepository.findById(invalidId))
                .thenThrow(new RecordNotFoundException(""));

        Assertions.assertDoesNotThrow(()->traineeService.getTraineeById(id));

        Assertions.assertThrows(RecordNotFoundException.class,()->traineeService.getTraineeById(invalidId));


    }
}