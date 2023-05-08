package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyServiceMember;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.SavePolicyLevelMemberAdditionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/policylevelmemberadditioncontroller")
public class PolicyLevelMemberAdditionController {

    @Autowired
    private SavePolicyLevelMemberAdditionControllerService savePolicyLevelMemberAdditionControllerService;

    @PostMapping
    public ResponseEntity<PolicyServiceMember> save(@RequestBody PolicyServiceMember policyServiceMember) {
        if (savePolicyLevelMemberAdditionControllerService.isValidComponentName(policyServiceMember.getComponentName())) {
            return new ResponseEntity<>(savePolicyLevelMemberAdditionControllerService.save(policyServiceMember), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping
    public ResponseEntity<PolicyServiceMember> update(@RequestBody PolicyServiceMember policyServiceMember) {
        if (savePolicyLevelMemberAdditionControllerService.isValidComponentName(policyServiceMember.getComponentName())) {
            return new ResponseEntity<>(savePolicyLevelMemberAdditionControllerService.update(policyServiceMember), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping(value = "/draft")
    public ResponseEntity<Void> setDraftStatus() {
        savePolicyLevelMemberAdditionControllerService.setDraftStatus();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/active")
    public ResponseEntity<Void> setActiveStatus() {
        savePolicyLevelMemberAdditionControllerService.setActiveStatus();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}