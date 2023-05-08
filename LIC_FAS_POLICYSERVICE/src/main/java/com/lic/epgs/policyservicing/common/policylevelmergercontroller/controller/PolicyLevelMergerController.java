package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTempEntity;

@Repository
public interface PolicyLevelMergerRepository extends JpaRepository<PolicyLevelMergerTempEntity, Long> {

    PolicyLevelMergerTempEntity getPolicyMergebyMergeId_PolicyLevelMergerController(Long mergeId);
}

package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTempEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerService;

@RestController
@RequestMapping("/policylevelmerge")
public class PolicyLevelMergerController {
	
	@Autowired
	PolicyLevelMergerService policyLevelMergerService;
	
	@GetMapping(value="/{mergeId}")
	public PolicyLevelMergerTempEntity getPolicyMergebyMergeId_PolicyLevelMergerController(@PathVariable Long mergeId){
		return policyLevelMergerService.getPolicyMergebyMergeId_PolicyLevelMergerController(mergeId);
	}

}