package com.hugewarriors.DailyDiary.Controllers;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@RequiredArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Long contact;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
