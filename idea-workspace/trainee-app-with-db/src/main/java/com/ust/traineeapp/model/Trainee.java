package com.ust.traineeapp.model;

import java.time.LocalDate;

public record Trainee(int id, String name,
                      String location, LocalDate joinedDate) {
}
