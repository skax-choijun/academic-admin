package com.skax.academic.controller;

import com.skax.academic.domain.Applicant;
import com.skax.academic.service.ApplicantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {
    private final ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping
    public List<Applicant> getAllApplicants() {
        return applicantService.findAll();
    }

    @GetMapping("/{id}")
    public Applicant getApplicant(@PathVariable Long id) {
        return applicantService.findById(id);
    }

    @PostMapping
    public void createApplicant(@RequestBody Applicant applicant) {
        applicantService.insert(applicant);
    }

    @PutMapping("/{id}")
    public void updateApplicant(@PathVariable Long id, @RequestBody Applicant applicant) {
        applicant.setId(id);
        applicantService.update(applicant);
    }

    @DeleteMapping("/{id}")
    public void deleteApplicant(@PathVariable Long id) {
        applicantService.delete(id);
    }
} 