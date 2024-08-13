package com.hugewarriors.DailyDiary.Controllers;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@RequiredArgsConstructor
public class AuthenticationResponse {
    private String token;
}
