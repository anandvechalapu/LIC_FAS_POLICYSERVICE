package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerService;

@RestController
public class PolicyLevelMergerController {
    
    @Autowired
    PolicyLevelMergerService policyLevelMergerService;

    @GetMapping("/merge/{mergeId}/master")
    public PolicyLevelMergerApiResponse getMasterPolicyMergebyMergeId(@PathVariable Long mergeId) {
        return policyLevelMergerService.getMasterPolicyMergebyMergeId(mergeId);
    }

    @GetMapping("/merge/{mergeId}")
    public PolicyLevelMergerDto findByMergeId(@PathVariable Long mergeId) {
        return policyLevelMergerService.findByMergeId(mergeId);
    }

    @GetMapping("/merge/{mergeId}/notes")
    public List<PolicyServiceNotesDto> findByMergeIdAndIsActive(@PathVariable Long mergeId, Boolean isActive) {
        return policyLevelMergerService.findByMergeIdAndIsActive(mergeId, isActive);
    }
}