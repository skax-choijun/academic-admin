package com.skax.academic.repository;

import com.skax.academic.domain.Applicant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApplicantMapper {
    Applicant findById(@Param("id") Long id);
    List<Applicant> findAll();
    void insert(Applicant applicant);
    void update(Applicant applicant);
    void delete(@Param("id") Long id);
} 