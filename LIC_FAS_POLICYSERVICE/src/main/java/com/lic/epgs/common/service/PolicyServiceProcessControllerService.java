package com.lic.epgs.common.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.dto.PolicyContributionDto;
import com.lic.epgs.common.dto.PolicyServiceProcessDto;
import com.lic.epgs.common.entity.PolicyContributionEntity;
import com.lic.epgs.common.repository.PolicyServiceProcessControllerRepository;
import com.lic.epgs.common.utils.PolicyServicingObjectMappingUtils;

@Service
public class PolicyServiceProcessControllerService {
	
	@Autowired
	private PolicyServiceProcessControllerRepository policyServiceProcessControllerRepository;
	
	public CommonResponseDto processPolicy(PolicyServiceProcessDto policyServiceProcessDto) {
		return policyServiceProcessControllerRepository.processPolicy(policyServiceProcessDto);
	}

	public PolicyContributionDto getPolicyContribution(String policyId) {
		Optional<PolicyContributionEntity> policyContributionEntity = policyServiceProcessControllerRepository.getPolicyContribution(policyId);
		if (policyContributionEntity.isPresent()) {
			return policyServiceProcessControllerRepository.copyProperties(policyContributionEntity.get());
		}
		return null;
	}

	public void logProcessStartAndEnd() {
		policyServiceProcessControllerRepository.logProcessStartAndEnd();
	}

	public void validateStatusRequest(PolicyServicingObjectMappingUtils policyServicingObjectMappingUtils) {
		policyServiceProcessControllerRepository.validateStatusRequest(policyServicingObjectMappingUtils);
	}
	
	public PolicyContributionDto copyProperties(PolicyContributionEntity policyContributionEntity) {
		PolicyContributionDto policyContributionDto = new PolicyContributionDto();
		BeanUtils.copyProperties(policyContributionEntity, policyContributionDto);
		return policyContributionDto;
	}

}