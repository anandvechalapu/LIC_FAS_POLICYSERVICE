package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.FetchPolicyLevelMergerRepository;

@Service
public class FetchPolicyLevelMergerService {

	@Autowired
	FetchPolicyLevelMergerRepository fetchPolicyLevelMergerRepository;
	
	public PolicyLevelMergerApiResponse fetchPolicyLevelMerger(PolicyLevelMergerDto requestBody) {
		return fetchPolicyLevelMergerRepository.fetchPolicyLevelMerger(requestBody);
	}

}

package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.FetchPolicyLevelMergerService;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.SaveAndUpdatePolicyLevelMergerService;

@RestController
@RequestMapping("/policyLevelMerger")
public class PolicyLevelMergerController {

	@Autowired
	SaveAndUpdatePolicyLevelMergerService saveAndUpdatePolicyLevelMergerService;
	
	@Autowired
	FetchPolicyLevelMergerService fetchPolicyLevelMergerService;
	
	@PostMapping("/saveAndUpdate")
	public PolicyLevelMergerApiResponse saveAndUpdatePolicyLevelMerger(@RequestBody PolicyLevelMergerDto requestBody) {
		return saveAndUpdatePolicyLevelMergerService.saveAndUpdatePolicyLevelMerger(requestBody);
	}
	
	@PostMapping("/fetch")
	public PolicyLevelMergerApiResponse fetchPolicyLevelMerger(@RequestBody PolicyLevelMergerDto requestBody) {
		return fetchPolicyLevelMergerService.fetchPolicyLevelMerger(requestBody);
	}
	
}