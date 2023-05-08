package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerSearchDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policylevelmerger")
public class PolicyLevelMergerController {

    @Autowired
    private PolicyLevelMergerService policyLevelMergerService;

    @GetMapping("/criteriaSearch")
    public ResponseEntity<PolicyLevelMergerApiResponse> getCriteriaSearchPolicy(
            @RequestParam String policyNumber,
            @RequestParam String product,
            @RequestParam String lineOfBusiness,
            @RequestParam String mergeStatus,
            @RequestParam String unitCode,
            @RequestParam String mphCode,
            @RequestParam String mphName) {

        PolicyLevelMergerApiResponse response = policyLevelMergerService.getCriteriaSearchPolicy(policyNumber, product, lineOfBusiness, mergeStatus, unitCode, mphCode, mphName);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}