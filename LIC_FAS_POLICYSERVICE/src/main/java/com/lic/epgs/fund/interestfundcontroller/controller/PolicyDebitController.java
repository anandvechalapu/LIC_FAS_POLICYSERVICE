package com.lic.epgs.fund.interestfundcontroller.controller;

import com.lic.epgs.fund.interestfundcontroller.model.DebitRequestDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.interestfundcontroller.service.PolicyDebitService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class PolicyDebitController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyDebitController.class);

    @Autowired
    private PolicyDebitService policyDebitService;

    @PostMapping("/debit")
    public ResponseEntity<InterestRateResponseDto> debitPolicy(@RequestBody DebitRequestDto debitRequestDto) {
        LOGGER.info("debiting policy number: {}", debitRequestDto.getPolicyNumber());
        InterestRateResponseDto response = policyDebitService.debitPolicy(debitRequestDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}