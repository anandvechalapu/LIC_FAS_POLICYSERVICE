package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTempEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerControllerRepository;

@Service
public class PolicyLevelMergerControllerService {

	@Autowired
	private PolicyLevelMergerControllerRepository policyLevelMergerControllerRepository;

	public PolicyLevelMergerApiResponse getPolicyMergebyMergeId(Long mergeId) {
		Optional<PolicyLevelMergerTempEntity> policyLevelMergerTempEntity = policyLevelMergerControllerRepository.findById(mergeId);
		if (policyLevelMergerTempEntity.isPresent()) {
			PolicyLevelMergerApiResponse policyLevelMergerApiResponse = new PolicyLevelMergerApiResponse();
			PolicyLevelMergerTempEntity policyLevelMergerTempEntityData = policyLevelMergerTempEntity.get();
			policyLevelMergerApiResponse.setMergeId(policyLevelMergerTempEntityData.getMergeId());
			policyLevelMergerApiResponse.setResponseCode(policyLevelMergerTempEntityData.getResponseCode());
			policyLevelMergerApiResponse.setResponseMessage(policyLevelMergerTempEntityData.getResponseMessage());

			return policyLevelMergerApiResponse;
		} else {
			return null;
		}
	}
}