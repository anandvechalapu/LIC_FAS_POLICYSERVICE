package com.lic.epgs.fund.policyinterestratefundcontroller.controller;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.service.PolicyInterestRateFundControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyInterestRateFundController {

    @Autowired
    private PolicyInterestRateFundControllerService policyInterestRateFundControllerService;

    @GetMapping("/policies/{policyNo}/interestrate")
    public InterestRateResponseDto getInterestRateForPolicy(@PathVariable String policyNo) {
        return policyInterestRateFundControllerService.creditPolicy(policyNo);
    }

}