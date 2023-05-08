package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.SaveNotedPolicyMeger_PolicyLevelMergerControllerService;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyServiceNotesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaveNotedPolicyMeger_PolicyLevelMergerControllerController {

    @Autowired
    private SaveNotedPolicyMeger_PolicyLevelMergerControllerService saveNotedPolicyMeger_PolicyLevelMergerControllerService;

    @PostMapping("/saveNotedPolicyMeger")
    @Transactional
    public PolicyServiceNotesDto saveNotedPolicyMeger(@RequestBody PolicyServiceNotesDto policyServiceNotesDto, @RequestParam Long mergeId) {
        return saveNotedPolicyMeger_PolicyLevelMergerControllerService.saveNotedPolicyMeger(policyServiceNotesDto, mergeId);
    }
}