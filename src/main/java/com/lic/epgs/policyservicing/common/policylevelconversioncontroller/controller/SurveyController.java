package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyQuestions;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyQuestionChoices;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.SurveyResponse;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.SurveyService;

@RestController
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/questions/{type}")
	public List<SurveyQuestions> getQuestionsByType(@PathVariable("type") String type) {
		return surveyService.findQuestionsByType(type);
	}
	
	@GetMapping("/answers/{questionId}")
	public List<SurveyQuestionChoices> getAnswersByQuestionId(@PathVariable("questionId") Long questionId) {
		return surveyService.findAnswersByQuestionId(questionId);
	}
	
	@PostMapping("/save")
	public SurveyResponse saveSurveyResponse(@RequestBody SurveyResponse surveyResponse) {
		return surveyService.saveSurveyResponse(surveyResponse);
	}

}