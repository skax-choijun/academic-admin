package com.skax.academic.repository;

import com.skax.academic.domain.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface ScoreMapper {
    Score findById(@Param("id") Long id);
    List<Score> findByApplicantId(@Param("applicantId") Long applicantId);
    List<Score> findAll();
    void insert(Score score);
    void update(Score score);
    void delete(@Param("id") Long id);
} 