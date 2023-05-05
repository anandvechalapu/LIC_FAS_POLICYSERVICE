package com.lic.epgs.fund.interestratelogcontroller.controller;

import com.lic.epgs.fund.interestratelogcontroller.model.FundInterestRateLog;
import com.lic.epgs.fund.interestratelogcontroller.service.FundInterestRateLogControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FundInterestRateLogController {

    @Autowired
    private FundInterestRateLogControllerService fundInterestRateLogControllerService;

    @PostMapping("/fund/interestratelog")
    public ResponseEntity<?> createErrorLog(@RequestBody FundInterestRateLog fundInterestRateLog) {
        fundInterestRateLogControllerService.createErrorLog(fundInterestRateLog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/fund/interestratelog/{policyNo}")
    public ResponseEntity<?> getErrorLogForPolicyNo(@PathVariable("policyNo") String policyNo) {
        return fundInterestRateLogControllerService.getErrorLogForPolicyNo(policyNo);
    }


    @GetMapping("/fund/interestratelogs/{policyNo}")
    public ResponseEntity<?> getErrorLogsForPolicyNo(@PathVariable("policyNo") String policyNo) {
        return fundInterestRateLogControllerService.getErrorLogsForPolicyNo(policyNo);
    }

    @GetMapping("/fund/interestratelogs")
    public ResponseEntity<?> getEmptyErrorLogsForPolicyNo(@RequestParam("policyNo") String policyNo) {
        return fundInterestRateLogControllerService.getEmptyErrorLogsForPolicyNo(policyNo);
    }

    @GetMapping("/fund/interestratelog/message/{policyNo}")
    public ResponseEntity<?> getErrorMessageForPolicyNo(@PathVariable("policyNo") String policyNo) {
        return fundInterestRateLogControllerService.getErrorMessageForPolicyNo(policyNo);
    }

}