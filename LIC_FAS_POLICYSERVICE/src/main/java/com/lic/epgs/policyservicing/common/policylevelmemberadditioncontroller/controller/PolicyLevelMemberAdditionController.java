package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyServiceMemberAdditionModel;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.PolicyLevelMemberAdditionControllerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/memberaddition/policyService")
public class PolicyLevelMemberAdditionController {
	
	@Autowired
	private PolicyLevelMemberAdditionControllerService policyLevelMemberAdditionControllerService;
	
	@PostMapping("/sendToMakerOrChecker")
	public ResponseEntity<PolicyServiceMemberAdditionModel> sendToMakerOrChecker(@RequestBody PolicyServiceMemberAdditionModel policyServiceMemberAdditionModel){
		return ResponseEntity.ok(policyLevelMemberAdditionControllerService.sendToMakerOrChecker(policyServiceMemberAdditionModel.getMemberAdditionStatus(), policyServiceMemberAdditionModel.getModifiedBy(), policyServiceMemberAdditionModel.getModifiedOn(), policyServiceMemberAdditionModel.getMemberAdditionId(), policyServiceMemberAdditionModel.getUnitCode()));
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<PolicyServiceMemberAdditionModel>> getAll(){
		return ResponseEntity.ok(policyLevelMemberAdditionControllerService.findAll());
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<PolicyServiceMemberAdditionModel> getById(@PathVariable Long id){
		return ResponseEntity.ok(policyLevelMemberAdditionControllerService.findById(id));
	}

}