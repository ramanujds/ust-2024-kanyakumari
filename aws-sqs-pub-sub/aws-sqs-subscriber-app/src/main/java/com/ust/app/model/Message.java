package com.ust.app.model;

import java.time.LocalDateTime;

public record Message(String id, String content, String createdAt) {
}
