package com.lic.epgs.fund.interestfundcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.fund.interestfundcontroller.model.InterestFundDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.interestfundcontroller.repository.PolicyCreditRepository;

@Service
public class PolicyCreditService {

    @Autowired
    private PolicyCreditRepository policyCreditRepository;

    public InterestRateResponseDto creditPolicy(InterestFundDto interestFundDto) {
        return policyCreditRepository.creditPolicy(interestFundDto);
    }

}