package com.lic.epgs.fund.policyinterestratefundcontroller.service;

import com.lic.epgs.fund.policyinterestratefundcontroller.dto.InterestRateResponseDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.repository.PolicyInterestRateFundControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyInterestRateFundControllerService {

    @Autowired
    private PolicyInterestRateFundControllerRepository policyInterestRateFundControllerRepository;

    public InterestRateResponseDto creditPolicyMemberByPolicyNo(String policyNo) {
        return policyInterestRateFundControllerRepository.creditPolicyMemberByPolicyNo(policyNo);
    }

    public InterestRateResponseDto creditBulkPolicyMembersByPolicyNo(String policyNo) {
        return policyInterestRateFundControllerRepository.creditBulkPolicyMembersByPolicyNo(policyNo);
    }

    public InterestRateResponseDto debitPolicyMemberByPolicyNoAndMemberId(String policyNo, String memberId) {
        return policyInterestRateFundControllerRepository.debitPolicyMemberByPolicyNoAndMemberId(policyNo, memberId);
    }

    public InterestRateResponseDto debitPolicyMembersByPolicyNo(String policyNo) {
        return policyInterestRateFundControllerRepository.debitPolicyMembersByPolicyNo(policyNo);
    }

    public InterestRateResponseDto debitBulkPolicyMembersByPolicyNo(String policyNo) {
        return policyInterestRateFundControllerRepository.debitBulkPolicyMembersByPolicyNo(policyNo);
    }

}