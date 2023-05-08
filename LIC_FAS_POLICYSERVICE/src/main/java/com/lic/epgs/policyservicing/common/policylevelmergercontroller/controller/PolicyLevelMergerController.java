package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerSearchDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.entity.PolicyLevelMergerEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerService;

@RestController
public class PolicyLevelMergerController {

    @Autowired
    private PolicyLevelMergerService policyLevelMergerService;

    @GetMapping("/search")
    public ResponseEntity<List<PolicyLevelMergerSearchDto>> getExistingCriteriaSearchPolicy(@RequestParam String policyNumber, @RequestParam String product, @RequestParam String lineOfBusiness, @RequestParam Integer mergeStatus, @RequestParam String unitCode, @RequestParam String mphCode, @RequestParam String mphName) {
        List<PolicyLevelMergerSearchDto> policies = policyLevelMergerService.getExistingCriteriaSearchPolicy(policyNumber, product, lineOfBusiness, mergeStatus, unitCode, mphCode, mphName);
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }
    
    @PostMapping("/save")
    public ResponseEntity<PolicyLevelMergerEntity> save(@RequestBody PolicyLevelMergerEntity entity) {
        PolicyLevelMergerEntity savedEntity = policyLevelMergerService.save(entity);
        return new ResponseEntity<>(savedEntity, HttpStatus.OK);
    }

}