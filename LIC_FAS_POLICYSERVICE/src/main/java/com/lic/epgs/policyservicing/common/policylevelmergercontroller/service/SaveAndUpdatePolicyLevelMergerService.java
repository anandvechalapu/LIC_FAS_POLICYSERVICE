package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.SaveAndUpdatePolicyLevelMergerRepository;

@Service
public class SaveAndUpdatePolicyLevelMergerService {
	
	@Autowired
	SaveAndUpdatePolicyLevelMergerRepository saveAndUpdatePolicyLevelMergerRepository;
	
	public PolicyLevelMergerApiResponse saveAndUpdatePolicyLevelMerger(PolicyLevelMergerDto requestBody) {
		return saveAndUpdatePolicyLevelMergerRepository.saveAndUpdatePolicyLevelMerger(requestBody);
	}
}