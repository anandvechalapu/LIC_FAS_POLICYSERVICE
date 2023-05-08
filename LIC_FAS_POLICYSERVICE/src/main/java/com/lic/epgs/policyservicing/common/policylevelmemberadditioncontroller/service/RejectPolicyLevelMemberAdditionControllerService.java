package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.RejectPolicyLevelMemberAdditionControllerRepository;

@Service
public class RejectPolicyLevelMemberAdditionControllerService {
	
	private RejectPolicyLevelMemberAdditionControllerRepository rejectPolicyLevelMemberAdditionControllerRepository;

	public ResponseEntity<?> rejectPolicyLevelMemberAddition(String memberAdditionId, String unitCode,
			String modifiedBy, LocalDateTime modifiedOn) {
		return rejectPolicyLevelMemberAdditionControllerRepository.rejectPolicyLevelMemberAddition(memberAdditionId, unitCode, modifiedBy, modifiedOn);
		
	}

}