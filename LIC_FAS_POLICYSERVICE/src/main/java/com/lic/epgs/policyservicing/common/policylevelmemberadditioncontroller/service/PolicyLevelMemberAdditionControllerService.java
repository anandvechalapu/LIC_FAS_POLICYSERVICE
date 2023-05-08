package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.PolicyServiceMemberAdditionEntity;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.SendToMaker_PolicyLevelMemberAdditionController;

@Service
public class PolicyLevelMemberAdditionControllerService {

	@Autowired
	private SendToMaker_PolicyLevelMemberAdditionController sendToMaker_PolicyLevelMemberAdditionController;

	@Transactional
	public void sendToMakerOrChecker(String memberAdditionStatus, String modifiedBy, String modifiedOn, Long memberAdditionId,
			String unitCode) {
		sendToMaker_PolicyLevelMemberAdditionController.sendToMakerOrChecker(memberAdditionStatus, modifiedBy, modifiedOn, memberAdditionId, unitCode);
	}
	
	public List<PolicyServiceMemberAdditionEntity> findAll(){
		return sendToMaker_PolicyLevelMemberAdditionController.findAll();
	}
	
	public PolicyServiceMemberAdditionEntity findById(Long id) {
		return sendToMaker_PolicyLevelMemberAdditionController.findById(id).orElse(null);
	}

}