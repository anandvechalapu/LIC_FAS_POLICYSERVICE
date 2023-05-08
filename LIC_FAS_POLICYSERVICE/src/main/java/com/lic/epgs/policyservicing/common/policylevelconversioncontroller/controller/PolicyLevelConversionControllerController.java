package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.PolicyLevelConversionController;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.RemoveDocumentDetails_PolicyLevelConversionControllerService;

@RestController
public class PolicyLevelConversionControllerController {

	@Autowired
	RemoveDocumentDetails_PolicyLevelConversionControllerService removeDocumentDetails_PolicyLevelConversionControllerService;
	
	@DeleteMapping("/removeDocumentDetails")
	public void deleteByDocumentIdAndConversionIdAndModifiedBy(@RequestParam Long documentId, 
			@RequestParam Long conversionId,
			@RequestParam String modifiedBy) {
		removeDocumentDetails_PolicyLevelConversionControllerService.deleteByDocumentIdAndConversionIdAndModifiedBy(documentId, conversionId, modifiedBy);
	}
	
	@PostMapping("/saveDocumentDetails")
	public void save(@RequestBody List<PolicyLevelConversionController> policyLevelConversionControllers) {
		for (PolicyLevelConversionController policyLevelConversionController : policyLevelConversionControllers) {
			removeDocumentDetails_PolicyLevelConversionControllerService.save(policyLevelConversionController);
		}
	}
	
}