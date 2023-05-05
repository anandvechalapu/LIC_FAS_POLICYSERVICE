package com.lic.epgs.policyservicing.common.commoncontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.commoncontroller.model.PolicyService;
import com.lic.epgs.policyservicing.common.commoncontroller.repository.EndServiceCommonController3Repository;

@Service
public class EndServiceCommonController3Service {
	
	@Autowired
	private EndServiceCommonController3Repository endServiceCommonController3Repository;
	
	public Optional<PolicyService> getPolicyService(Long policyId, Long serviceId) {
		return endServiceCommonController3Repository.findByPolicyIdAndServiceId(policyId, serviceId);
	}
	
	public void endService(Long policyId, Long serviceId) {
		endServiceCommonController3Repository.endService(policyId, serviceId);
	}

}