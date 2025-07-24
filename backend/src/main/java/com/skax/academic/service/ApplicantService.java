package com.skax.academic.service;

import com.skax.academic.domain.Applicant;
import com.skax.academic.repository.ApplicantMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {
    private final ApplicantMapper applicantMapper;

    public ApplicantService(ApplicantMapper applicantMapper) {
        this.applicantMapper = applicantMapper;
    }

    public Applicant findById(Long id) {
        return applicantMapper.findById(id);
    }

    public List<Applicant> findAll() {
        return applicantMapper.findAll();
    }

    public void insert(Applicant applicant) {
        applicantMapper.insert(applicant);
    }

    public void update(Applicant applicant) {
        applicantMapper.update(applicant);
    }

    public void delete(Long id) {
        applicantMapper.delete(id);
    }
} 