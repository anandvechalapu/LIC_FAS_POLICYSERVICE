package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyQuestions;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyQuestionChoices;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyResponse;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.SurveyRepository;

@Service
public class SurveyService {
	
	@Autowired
	private SurveyRepository surveyRepository;
	
	public List<SurveyQuestions> findQuestionsByType(String type) {
		return surveyRepository.findQuestionsByType(type);
	}
	
	public List<SurveyQuestionChoices> findAnswersByQuestionId(Long questionId) {
		return surveyRepository.findAnswersByQuestionId(questionId);
	}
	
	public SurveyResponse saveSurveyResponse(SurveyResponse surveyResponse) {
		return surveyRepository.saveSurveyResponse(surveyResponse);
	}

}