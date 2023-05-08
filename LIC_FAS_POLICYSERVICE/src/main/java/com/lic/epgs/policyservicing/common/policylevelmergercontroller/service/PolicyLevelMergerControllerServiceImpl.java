package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerControllerRepository;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceDocumentDto;

@Service
public class PolicyLevelMergerControllerServiceImpl implements PolicyLevelMergerControllerService{
	
	@Autowired
	private PolicyLevelMergerControllerRepository policyLevelMergerControllerRepository;

	@Override
	public Optional<PolicyServiceDocumentDto> findByDocumentId(Long documentId) {
		return policyLevelMergerControllerRepository.findByDocumentId(documentId);
	}

	@Override
	public void updateIsActive(Long documentId, Boolean isActive) {
		policyLevelMergerControllerRepository.updateIsActive(documentId, isActive);
		
	}

	@Override
	public void deleteByDocumentId(Long documentId) {
		policyLevelMergerControllerRepository.deleteByDocumentId(documentId);
		
	}

}