package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.ExistingPolicy;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.GetExistingPolicyById_PolicyLevelFreeLookCancelControllerRepository;

@Service
public class GetExistingPolicyById_PolicyLevelFreeLookCancelControllerService {
	
	@Autowired
	GetExistingPolicyById_PolicyLevelFreeLookCancelControllerRepository existingPolicyRepository;
	
	public ExistingPolicy findByPolicyNumber(String policyNumber) {
		return existingPolicyRepository.findByPolicyNumber(policyNumber);
	}
	
	public ExistingPolicy findByMembersName(String name) {
		return existingPolicyRepository.findByMembersName(name);
	}
	
	public ExistingPolicy findByAdjustmentsAdjustmentNumber(String adjustmentNumber) {
		return existingPolicyRepository.findByAdjustmentsAdjustmentNumber(adjustmentNumber);
	}
	
	public ExistingPolicy findByPolicyDispatchDate(String dispatchDate) {
		return existingPolicyRepository.findByPolicyDispatchDate(dispatchDate);
	}
	
	public ExistingPolicy findByPolicyRecievedDate(String recievedDate) {
		return existingPolicyRepository.findByPolicyRecievedDate(recievedDate);
	}
	
	public ExistingPolicy findByTotalContribution(String totalContribution) {
		return existingPolicyRepository.findByTotalContribution(totalContribution);
	}
	
	public ExistingPolicy findByTransactionMessage(String message) {
		return existingPolicyRepository.findByTransactionMessage(message);
	}
	
	public ExistingPolicy findByTransactionStatus(String status) {
		return existingPolicyRepository.findByTransactionStatus(status);
	}

	public List<ExistingPolicy> findAllExistingPolicies() {
		return existingPolicyRepository.findAll();
	}

}