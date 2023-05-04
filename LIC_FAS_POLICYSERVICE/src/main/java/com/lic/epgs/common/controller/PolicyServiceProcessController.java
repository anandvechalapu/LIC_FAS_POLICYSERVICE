package com.lic.epgs.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.dto.PolicyContributionDto;
import com.lic.epgs.common.dto.PolicyServiceProcessDto;
import com.lic.epgs.common.utils.PolicyServicingObjectMappingUtils;
import com.lic.epgs.common.service.PolicyServiceProcessControllerService;

@RestController
@RequestMapping("/api/epgs/policyserviceprocess")
public class PolicyServiceProcessController {

	@Autowired
	private PolicyServiceProcessControllerService policyServiceProcessControllerService;

	@PostMapping("/process")
	public CommonResponseDto processPolicy(@RequestBody PolicyServiceProcessDto policyServiceProcessDto) {
		return policyServiceProcessControllerService.processPolicy(policyServiceProcessDto);
	}

	@PostMapping("/contribution")
	public PolicyContributionDto getPolicyContribution(String policyId) {
		return policyServiceProcessControllerService.getPolicyContribution(policyId);
	}

	@PostMapping("/logprocess")
	public void logProcessStartAndEnd() {
		policyServiceProcessControllerService.logProcessStartAndEnd();
	}

	@PostMapping("/validatestatus")
	public void validateStatusRequest(@RequestBody PolicyServicingObjectMappingUtils policyServicingObjectMappingUtils) {
		policyServiceProcessControllerService.validateStatusRequest(policyServicingObjectMappingUtils);
	}

}