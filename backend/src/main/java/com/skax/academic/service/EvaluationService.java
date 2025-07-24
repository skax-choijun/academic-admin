package com.skax.academic.service;

import com.skax.academic.domain.Evaluation;
import com.skax.academic.repository.EvaluationMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EvaluationService {
    private final EvaluationMapper evaluationMapper;

    public EvaluationService(EvaluationMapper evaluationMapper) {
        this.evaluationMapper = evaluationMapper;
    }

    public Evaluation findById(Long id) {
        return evaluationMapper.findById(id);
    }

    public List<Evaluation> findByApplicantId(Long applicantId) {
        return evaluationMapper.findByApplicantId(applicantId);
    }

    public List<Evaluation> findAll() {
        return evaluationMapper.findAll();
    }

    public void insert(Evaluation evaluation) {
        evaluationMapper.insert(evaluation);
    }

    public void update(Evaluation evaluation) {
        evaluationMapper.update(evaluation);
    }

    public void delete(Long id) {
        evaluationMapper.delete(id);
    }
} 