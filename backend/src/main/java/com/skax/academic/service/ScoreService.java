package com.skax.academic.service;

import com.skax.academic.domain.Score;
import com.skax.academic.repository.ScoreMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScoreService {
    private final ScoreMapper scoreMapper;

    public ScoreService(ScoreMapper scoreMapper) {
        this.scoreMapper = scoreMapper;
    }

    public Score findById(Long id) {
        return scoreMapper.findById(id);
    }

    public List<Score> findByApplicantId(Long applicantId) {
        return scoreMapper.findByApplicantId(applicantId);
    }

    public List<Score> findAll() {
        return scoreMapper.findAll();
    }

    public void insert(Score score) {
        scoreMapper.insert(score);
    }

    public void update(Score score) {
        scoreMapper.update(score);
    }

    public void delete(Long id) {
        scoreMapper.delete(id);
    }
} 