package com.lic.epgs.fund.interestfundcontroller.service;

import com.lic.epgs.fund.interestfundcontroller.model.DebitRequestDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.interestfundcontroller.repository.PolicyDebitRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyDebitService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyDebitService.class);

    @Autowired
    private PolicyDebitRepository policyDebitRepository;

    public InterestRateResponseDto debitPolicy(DebitRequestDto debitRequestDto) {
        LOGGER.info("debiting policy number: {}", debitRequestDto.getPolicyNumber());
        return policyDebitRepository.debitPolicy(debitRequestDto);
    }

}