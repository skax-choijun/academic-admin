package com.skax.academic.controller;

import com.skax.academic.domain.Evaluation;
import com.skax.academic.service.EvaluationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/evaluations")
public class EvaluationController {
    private final EvaluationService evaluationService;

    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @GetMapping
    public List<Evaluation> getAllEvaluations() {
        return evaluationService.findAll();
    }

    @GetMapping("/applicant/{applicantId}")
    public List<Evaluation> getEvaluationsByApplicant(@PathVariable Long applicantId) {
        return evaluationService.findByApplicantId(applicantId);
    }

    @GetMapping("/{id}")
    public Evaluation getEvaluation(@PathVariable Long id) {
        return evaluationService.findById(id);
    }

    @PostMapping
    public void createEvaluation(@RequestBody Evaluation evaluation) {
        evaluationService.insert(evaluation);
    }

    @PutMapping("/{id}")
    public void updateEvaluation(@PathVariable Long id, @RequestBody Evaluation evaluation) {
        evaluation.setId(id);
        evaluationService.update(evaluation);
    }

    @DeleteMapping("/{id}")
    public void deleteEvaluation(@PathVariable Long id) {
        evaluationService.delete(id);
    }
} 