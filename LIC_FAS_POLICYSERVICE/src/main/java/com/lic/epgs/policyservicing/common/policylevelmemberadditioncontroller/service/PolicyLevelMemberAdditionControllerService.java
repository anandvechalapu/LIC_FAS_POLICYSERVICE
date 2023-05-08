package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.PolicyLevelMemberAdditionControllerRepository;

@Service
public class PolicyLevelMemberAdditionControllerService {

	@Autowired
	private PolicyLevelMemberAdditionControllerRepository policyLevelMemberAdditionControllerRepository;

	public CommonResponseDto<Object> getAllPolicyLevelMemberAdditionController(
			PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto) {
		return policyLevelMemberAdditionControllerRepository.getAllPolicyLevelMemberAdditionController(policyServiceMemberAdditionDto);
	}

	public List<PolicyServiceMbrDto> getMemberDetails() {
		return policyLevelMemberAdditionControllerRepository.getMemberDetails();
	}

	public List<PolicyServiceMemberAdditionDto> getMemberAdditionDetails() {
		return policyLevelMemberAdditionControllerRepository.getMemberAdditionDetails();
	}

	public List<String> getNotes() {
		return policyLevelMemberAdditionControllerRepository.getNotes();
	}

}