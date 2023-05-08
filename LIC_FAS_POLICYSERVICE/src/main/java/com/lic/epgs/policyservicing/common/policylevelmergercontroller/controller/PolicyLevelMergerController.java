package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerService;

@RestController
@RequestMapping("/policyLevelMerger")
public class PolicyLevelMergerController {
	
	@Autowired
	private PolicyLevelMergerService policyLevelMergerService;
	
	@GetMapping("/masterPolicyMerge/{id}")
	public PolicyLevelMergerDto getMasterPolicyMergebyMergeId(@PathVariable Long mergeId) {
		return policyLevelMergerService.getMasterPolicyMergebyMergeId(mergeId);
	}
	
	@GetMapping("/notes/{id}")
	public List<PolicyServiceNotesDto> getNotesByMergeIdAndIsActive(@PathVariable Long mergeId, boolean isActive) {
		return policyLevelMergerService.getNotesByMergeIdAndIsActive(mergeId, isActive);
	}

}