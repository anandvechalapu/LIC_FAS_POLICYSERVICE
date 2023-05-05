package com.lic.epgs.policyservicing.common.commoncontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.commoncontroller.model.PolicyServiceDTO;
import com.lic.epgs.policyservicing.common.commoncontroller.repository.EndServiceCommonControllerRepository;

@Service
public class EndServiceCommonControllerService {
	
	@Autowired
	private EndServiceCommonControllerRepository endServiceCommonControllerRepository;
	
	public int endService(String policyId, String serviceId, String serviceType, String workflowStatus, String modifiedBy, String modifiedOn){
		return endServiceCommonControllerRepository.endService(policyId, serviceId, serviceType, workflowStatus, modifiedBy, modifiedOn);
	}
	
	public Optional<PolicyServiceDTO> findPolicyService(String policyId, String serviceId, String serviceType) {
		return endServiceCommonControllerRepository.findPolicyService(policyId, serviceId, serviceType);
	}

}