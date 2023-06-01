package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyQuestions;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyQuestionChoices;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyResponse;

public interface SurveyRepository extends JpaRepository<SurveyQuestions, Long> {
    
    @Query("SELECT q FROM SurveyQuestions q WHERE q.type=:type")
    public List<SurveyQuestions> findQuestionsByType(@Param("type") String type);

    @Query("SELECT c FROM SurveyQuestionChoices c WHERE c.questionId=:questionId")
    public List<SurveyQuestionChoices> findAnswersByQuestionId(@Param("questionId") Long questionId);

    public SurveyResponse saveSurveyResponse(SurveyResponse surveyResponse);

}