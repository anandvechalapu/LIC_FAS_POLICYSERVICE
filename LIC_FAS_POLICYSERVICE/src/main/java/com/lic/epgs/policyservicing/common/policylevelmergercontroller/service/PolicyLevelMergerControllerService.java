package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.ExistingPolicy;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerControllerRepository;

@Service
public class PolicyLevelMergerControllerService {
	
	@Autowired
	private PolicyLevelMergerControllerRepository policyLevelMergerControllerRepository;
	
	public ExistingPolicy getExistingPolicyByPolicyNumber(String policyNumber) {
		return policyLevelMergerControllerRepository.getExistingPolicyByPolicyNumber(policyNumber);
	}

}