package com.lic.epgs.policyservicing.common.commoncontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.commoncontroller.model.PolicyServiceDTO;
import com.lic.epgs.policyservicing.common.commoncontroller.service.EndServiceCommonControllerService;

@RestController
@RequestMapping("/endServiceCommonController")
public class EndServiceCommonController {
	
	@Autowired
	private EndServiceCommonControllerService endServiceCommonControllerService;
	
	@PostMapping("/endService")
	public int endService(@RequestParam String policyId, @RequestParam String serviceId, @RequestParam String serviceType,
			@RequestParam String workflowStatus, @RequestParam String modifiedBy, @RequestParam String modifiedOn){
		return endServiceCommonControllerService.endService(policyId, serviceId, serviceType, workflowStatus, modifiedBy, modifiedOn);
	}
	
	@GetMapping("/findPolicyService/{policyId}/{serviceId}/{serviceType}")
	public Optional<PolicyServiceDTO> findPolicyService(@PathVariable String policyId, @PathVariable String serviceId, @PathVariable String serviceType){
		return endServiceCommonControllerService.findPolicyService(policyId, serviceId, serviceType);
	}

}