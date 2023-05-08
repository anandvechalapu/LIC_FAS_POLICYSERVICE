package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RejectPolicyLevelMemberAdditionControllerRepository extends JpaRepository<RejectPolicyLevelMemberAdditionControllerModel, Long> {
	
	ResponseEntity<?> rejectPolicyLevelMemberAddition(String memberAdditionId, String unitCode,
			String modifiedBy, LocalDateTime modifiedOn);

}

package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.RejectPolicyLevelMemberAdditionControllerModel;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.RejectPolicyLevelMemberAdditionControllerService;

@RestController
public class RejectPolicyLevelMemberAdditionController {

	private RejectPolicyLevelMemberAdditionControllerService rejectPolicyLevelMemberAdditionControllerService;
	
	@PostMapping("/reject")
	public ResponseEntity<?> rejectPolicyLevelMemberAddition(@RequestBody RejectPolicyLevelMemberAdditionControllerModel rejectPolicyLevelMemberAdditionControllerModel){
		String memberAdditionId = rejectPolicyLevelMemberAdditionControllerModel.getMemberAdditionId();
		String unitCode = rejectPolicyLevelMemberAdditionControllerModel.getUnitCode();
		String modifiedBy = rejectPolicyLevelMemberAdditionControllerModel.getModifiedBy();
		LocalDateTime modifiedOn = rejectPolicyLevelMemberAdditionControllerModel.getModifiedOn();
		
		return rejectPolicyLevelMemberAdditionControllerService.rejectPolicyLevelMemberAddition(memberAdditionId, unitCode, modifiedBy, modifiedOn);
	}

}