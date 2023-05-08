package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/policyLevelMerger")
public class PolicyLevelMergerController {

    private PolicyLevelMergerService policyLevelMergerService;

    public PolicyLevelMergerController(PolicyLevelMergerService policyLevelMergerService) {
        this.policyLevelMergerService = policyLevelMergerService;
    }

    @PutMapping("/updateStatus")
    public ResponseEntity<Void> updateStatus(@RequestBody Boolean status, @RequestParam String modifiedBy, @RequestParam Long id) {
        policyLevelMergerService.updateStatus(status, modifiedBy, id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/saveAndUpdatePolicyLevelMerger")
    public ResponseEntity<Void> saveAndUpdatePolicyLevelMerger(@RequestBody PolicyLevelMergerDto policyLevelMergerDto, @RequestBody PolicyLevelMergerApiResponse response) {
        policyLevelMergerService.saveAndUpdatePolicyLevelMerger(policyLevelMergerDto, response);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/validPolicyNumberAndType")
    public ResponseEntity<Boolean> validPolicyNumberAndType(@RequestParam String policyNumber, @RequestParam String policyType) {
        return new ResponseEntity<>(policyLevelMergerService.validPolicyNumberAndType(policyNumber, policyType), HttpStatus.OK);
    }
}