package com.skax.academic.controller;

import com.skax.academic.domain.Score;
import com.skax.academic.service.ScoreService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/scores")
public class ScoreController {
    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping
    public List<Score> getAllScores() {
        return scoreService.findAll();
    }

    @GetMapping("/applicant/{applicantId}")
    public List<Score> getScoresByApplicant(@PathVariable Long applicantId) {
        return scoreService.findByApplicantId(applicantId);
    }

    @GetMapping("/{id}")
    public Score getScore(@PathVariable Long id) {
        return scoreService.findById(id);
    }

    @PostMapping
    public void createScore(@RequestBody Score score) {
        scoreService.insert(score);
    }

    @PutMapping("/{id}")
    public void updateScore(@PathVariable Long id, @RequestBody Score score) {
        score.setId(id);
        scoreService.update(score);
    }

    @DeleteMapping("/{id}")
    public void deleteScore(@PathVariable Long id) {
        scoreService.delete(id);
    }
} 