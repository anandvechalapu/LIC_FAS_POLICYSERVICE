package com.lic.epgs.fund.policyinterestratefundcontroller.service;

import com.lic.epgs.fund.policyinterestratefundcontroller.dto.InterestRateResponseDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.repository.MemberCreditRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberCreditService {

    @Autowired
    MemberCreditRepository memberCreditRepository;

    public InterestRateResponseDto getInterestRateByPolicyNumber(String policyNumber) {
        return memberCreditRepository.findByPolicyNumber(policyNumber);
    }
}