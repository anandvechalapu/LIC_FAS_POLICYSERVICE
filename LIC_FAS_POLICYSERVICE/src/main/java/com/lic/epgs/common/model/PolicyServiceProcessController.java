package com.lic.epgs.common.model;

import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.dto.PolicyContributionDto;
import com.lic.epgs.common.dto.PolicyServiceProcessDto;
import com.lic.epgs.common.utils.PolicyServicingObjectMappingUtils;

public class PolicyServiceProcessController {

	private PolicyServiceProcessControllerRepository policyServiceProcessControllerRepository;

	public CommonResponseDto processPolicy(PolicyServiceProcessDto policyServiceProcessDto) {
		return policyServiceProcessControllerRepository.processPolicy(policyServiceProcessDto);
	}

	public PolicyContributionDto getPolicyContribution(String policyId) {
		return policyServiceProcessControllerRepository.getPolicyContribution(policyId);
	}

	public void logProcessStartAndEnd() {
		policyServiceProcessControllerRepository.logProcessStartAndEnd();
	}

	public void validateStatusRequest(PolicyServicingObjectMappingUtils policyServicingObjectMappingUtils) {
		policyServiceProcessControllerRepository.validateStatusRequest(policyServicingObjectMappingUtils);
	}

	public PolicyContributionDto copyProperties(PolicyContributionEntity policyContributionEntity) {
		return policyServiceProcessControllerRepository.copyProperties(policyContributionEntity);
	}
}