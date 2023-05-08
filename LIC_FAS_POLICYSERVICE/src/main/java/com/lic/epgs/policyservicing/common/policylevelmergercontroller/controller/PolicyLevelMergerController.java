package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerSearchDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerControllerService;

@RestController
@RequestMapping("/policy-level-merger-controller")
public class PolicyLevelMergerController {

    @Autowired
    private PolicyLevelMergerControllerService policyLevelMergerControllerService;

    @GetMapping("/search")
    public ResponseEntity<List<PolicyLevelMergerSearchDto>> getCriteriaSearchPolicy(@RequestParam String policyNumber,
            @RequestParam String product, @RequestParam String lineOfBusiness, @RequestParam String mergeStatus,
            @RequestParam String unitCode, @RequestParam String mphCode, @RequestParam String mphName) {
        List<PolicyLevelMergerSearchDto> policyLevelMergerSearchDtos = policyLevelMergerControllerService
                .getCriteriaSearchPolicy(policyNumber, product, lineOfBusiness, mergeStatus, unitCode, mphCode, mphName);
        return new ResponseEntity<>(policyLevelMergerSearchDtos, HttpStatus.OK);
    }
}