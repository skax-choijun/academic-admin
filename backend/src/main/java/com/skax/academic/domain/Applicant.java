package com.skax.academic.domain;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Applicant {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String applyType; // 지원 전형
    private LocalDateTime createdAt;
} 