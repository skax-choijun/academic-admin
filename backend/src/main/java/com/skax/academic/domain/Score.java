package com.skax.academic.domain;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Score {
    private Long id;
    private Long applicantId;
    private String type; // ex: 학생부, 수능
    private Double value;
    private LocalDateTime createdAt;
} 