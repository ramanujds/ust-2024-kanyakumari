package com.ust.traineeapp.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ust.traineeapp.exception.RecordNotFoundException;
import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.service.TraineeService;
import com.ust.traineeapp.service.TraineeServiceImpl;
import jakarta.servlet.ServletException;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(TraineeController.class)
class TraineeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private TraineeServiceImpl traineeService;

    @Test
    void getTrainee() throws Exception {

        // Given
        Trainee trainee = new Trainee(1,"Harsh","Kerala", LocalDate.now());
        int id = 1;
        int invalidId=100;

        // When
        Mockito.when(traineeService.getTraineeById(id)).thenReturn(trainee);
        Mockito.when(traineeService.getTraineeById(invalidId)).thenThrow(new RecordNotFoundException(""));

        // Then

        mockMvc.perform(get("/api/v1/trainees/"+id))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", Matchers.is(id)))
				.andExpect(jsonPath("$.name", Matchers.is(trainee.getName())))
				.andExpect(jsonPath("$.location", Matchers.is(trainee.getLocation())))
				.andExpect(jsonPath("$.joinedDate", Matchers.is(trainee.getJoinedDate().format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")))))
				.andReturn();

        mockMvc.perform(get("/api/v1/trainees/"+invalidId))
                .andExpect(status().isNotFound())
                .andReturn();

    }


    @Test
    void saveTrainee() throws Exception {

        // Given
        Trainee trainee = new Trainee(1,"Harsh","Kerala", LocalDate.parse("2024-10-14"));
        int id = 1;

        // When
        Mockito.when(traineeService.saveTrainee(trainee)).thenReturn(trainee);

        // Then

        mockMvc.perform(post("/api/v1/trainees")
                        .contentType("application/json")
//                        .content("""
//                                {
//                                    "id": 1,
//                                    "name": "Harsh",
//                                    "location": "Kerala",
//                                    "joinedDate": "14/Oct/2024"
//                                }
//                                """)
                                .content(asJsonString(trainee))
                        .accept("application/json")
                    )

                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id", Matchers.is(id)))
                .andExpect(jsonPath("$.name", Matchers.is(trainee.getName())))
                .andExpect(jsonPath("$.location", Matchers.is(trainee.getLocation())))
                .andExpect(jsonPath("$.joinedDate", Matchers.is(trainee.getJoinedDate().format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")))))
                .andReturn();

    }



    private String asJsonString(Object object) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper.writeValueAsString(object);
    }

}