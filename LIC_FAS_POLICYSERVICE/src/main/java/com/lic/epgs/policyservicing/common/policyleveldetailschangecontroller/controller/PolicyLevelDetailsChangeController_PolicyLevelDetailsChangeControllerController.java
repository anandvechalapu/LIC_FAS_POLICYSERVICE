package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeController;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeControllerService;

@RestController
public class PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeControllerController {

    @Autowired
    private PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeControllerService policyLevelDetailsChangeControllerService;

    @GetMapping("/policyLevelDetailsChangeController/{policyNumber}/{policyDetailsId}")
    public PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeController getByPolicyNumberAndPolicyDetailsId(@PathVariable("policyNumber") String policyNumber, @PathVariable("policyDetailsId") Long policyDetailsId){
        return policyLevelDetailsChangeControllerService.findByPolicyNumberAndPolicyDetailsId(policyNumber, policyDetailsId);
    }

    @PostMapping("/policyLevelDetailsChangeController")
    public PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeController save(@RequestBody PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeController policyLevelDetailsChangeController){
        return policyLevelDetailsChangeControllerService.save(policyLevelDetailsChangeController);
    }

}