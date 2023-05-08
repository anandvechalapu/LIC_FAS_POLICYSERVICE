//Controller Class

package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerControllerService;

@RestController
@RequestMapping("/api/merge")
public class PolicyLevelMergerController {
	
	@Autowired
	private PolicyLevelMergerControllerService policyLevelMergerControllerService;
	
	@GetMapping("/{mergeId}")
	public PolicyLevelMergerApiResponse getMergebyMergeId(@PathVariable Long mergeId){
		return policyLevelMergerControllerService.getPolicyMergebyMergeId(mergeId);
	}

}