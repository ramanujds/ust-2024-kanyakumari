package com.ust.traineeapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "trainee_db")
@NamedQueries(
        {@NamedQuery(query = "from Trainee where location=:location", name = "findByLocation")}
)
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trainee_id")
//    @JsonProperty("trainee_id")
    private int id;
    @Column(name = "trainee_name",length = 50)
    private String name;
    @Column(length = 100)
    private String location;
    @Column(name = "joined_date")
   @JsonFormat(pattern = "dd/MMM/yyyy")
    private LocalDate joinedDate;
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Project project;

}
