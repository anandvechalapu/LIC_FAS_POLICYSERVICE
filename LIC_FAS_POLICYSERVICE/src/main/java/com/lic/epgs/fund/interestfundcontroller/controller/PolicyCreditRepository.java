package com.lic.epgs.fund.interestfundcontroller.repository;

import org.springframework.stereotype.Repository;

import com.lic.epgs.fund.interestfundcontroller.model.InterestFundDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestRateResponseDto;

@Repository
public class PolicyCreditRepository {

    public InterestRateResponseDto creditPolicy(InterestFundDto interestFundDto) {
        InterestRateResponseDto interestRateResponseDto = new InterestRateResponseDto();
        interestRateResponseDto.setInterestRate(2.5);
        return interestRateResponseDto;
    }

}

package com.lic.epgs.fund.interestfundcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.interestfundcontroller.model.InterestFundDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.interestfundcontroller.service.PolicyCreditService;

@RestController
public class PolicyCreditController {

    @Autowired
    private PolicyCreditService policyCreditService;

    @PostMapping("/credit-policy")
    public InterestRateResponseDto creditPolicy(@RequestBody InterestFundDto interestFundDto) {
        return policyCreditService.creditPolicy(interestFundDto);
    }

}