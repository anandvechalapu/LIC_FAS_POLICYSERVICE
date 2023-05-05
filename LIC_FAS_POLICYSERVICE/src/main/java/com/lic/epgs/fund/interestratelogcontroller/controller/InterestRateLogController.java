package com.lic.epgs.fund.interestratelogcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.interestratelogcontroller.model.InterestRateLog;
import com.lic.epgs.fund.interestratelogcontroller.service.InterestRateLogControllerService;

@RestController
@RequestMapping("/InterestRateLog")
public class InterestRateLogController {

    @Autowired
    private InterestRateLogControllerService interestRateLogControllerService;

    @GetMapping("/failed")
    public List<InterestRateLog> getFailedInterestRateLogs() {
        return interestRateLogControllerService.findByIsFailTrueOrderByIdAsc();
    }

    @GetMapping("/policy/{policyNo}")
    public List<InterestRateLog> getInterestRateLogsByPolicyNo(@PathVariable String policyNo) {
        return interestRateLogControllerService.findByPolicyNoOrderByIdAsc(policyNo);
    }

    @GetMapping("/reference/{referenceNo}")
    public List<InterestRateLog> getInterestRateLogsByReferenceNo(@PathVariable String referenceNo) {
        return interestRateLogControllerService.findByReferenceNoOrderByIdAsc(referenceNo);
    }

    @GetMapping
    public List<InterestRateLog> getAllInterestRateLogs() {
        return interestRateLogControllerService.findAllByOrderByIdAsc();
    }
}