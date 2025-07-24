package com.skax.academic.repository;

import com.skax.academic.domain.Evaluation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface EvaluationMapper {
    Evaluation findById(@Param("id") Long id);
    List<Evaluation> findByApplicantId(@Param("applicantId") Long applicantId);
    List<Evaluation> findAll();
    void insert(Evaluation evaluation);
    void update(Evaluation evaluation);
    void delete(@Param("id") Long id);
} 