package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.PolicyLevelConversionController;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.RemoveDocumentDetails_PolicyLevelConversionControllerRepository;

@Service
public class RemoveDocumentDetails_PolicyLevelConversionControllerService {

	@Autowired
	RemoveDocumentDetails_PolicyLevelConversionControllerRepository removeDocumentDetails_PolicyLevelConversionControllerRepository;
	
	public void deleteByDocumentIdAndConversionIdAndModifiedBy(Long documentId, Long conversionId, String modifiedBy) {
		removeDocumentDetails_PolicyLevelConversionControllerRepository.deleteByDocumentIdAndConversionIdAndModifiedBy(documentId, conversionId, modifiedBy);
	}
	
	public void save(PolicyLevelConversionController policyLevelConversionController) {
		removeDocumentDetails_PolicyLevelConversionControllerRepository.save(policyLevelConversionController);
	}
	
}