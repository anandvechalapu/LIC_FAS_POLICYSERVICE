package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.PolicyLevelMemberAdditionControllerService;

@RestController
@RequestMapping("/policyLevelMemberAdditionController")
public class PolicyLevelMemberAdditionController {

	@Autowired
	PolicyLevelMemberAdditionControllerService policyLevelMemberAdditionControllerService;

	@GetMapping("/getall")
	public ResponseEntity<CommonResponseDto<Object>> getAllPolicyLevelMemberAdditionController(
			PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto) {
		CommonResponseDto<Object> response = policyLevelMemberAdditionControllerService
				.getAllPolicyLevelMemberAdditionController(policyServiceMemberAdditionDto);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/getmemberdetails")
	public ResponseEntity<List<PolicyServiceMbrDto>> getMemberDetails() {
		List<PolicyServiceMbrDto> response = policyLevelMemberAdditionControllerService.getMemberDetails();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/getmemberadditiondetails")
	public ResponseEntity<List<PolicyServiceMemberAdditionDto>> getMemberAdditionDetails() {
		List<PolicyServiceMemberAdditionDto> response = policyLevelMemberAdditionControllerService
				.getMemberAdditionDetails();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/getnotes")
	public ResponseEntity<List<String>> getNotes() {
		List<String> response = policyLevelMemberAdditionControllerService.getNotes();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}