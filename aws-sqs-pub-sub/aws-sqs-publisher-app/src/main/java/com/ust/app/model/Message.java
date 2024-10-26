package com.ust.app.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Message(int id, String content, LocalDateTime createdAt) {
}
