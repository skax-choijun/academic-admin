package com.skax.academic.domain;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Evaluation {
    private Long id;
    private Long applicantId;
    private String item; // 평가 항목명
    private Double weight;
    private Double score;
    private LocalDateTime createdAt;
} 