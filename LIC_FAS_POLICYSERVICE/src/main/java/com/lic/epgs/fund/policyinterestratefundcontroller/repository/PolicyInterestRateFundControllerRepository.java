package com.lic.epgs.fund.policyinterestratefundcontroller.repository;

import com.lic.epgs.fund.policyinterestratefundcontroller.dto.InterestRateResponseDto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyInterestRateFundControllerRepository extends JpaRepository<InterestRateResponseDto, Long> {

    InterestRateResponseDto creditPolicyMemberByPolicyNo(String policyNo);

    InterestRateResponseDto creditBulkPolicyMembersByPolicyNo(String policyNo);

    InterestRateResponseDto debitPolicyMemberByPolicyNoAndMemberId(String policyNo, String memberId);

    InterestRateResponseDto debitPolicyMembersByPolicyNo(String policyNo);

    InterestRateResponseDto debitBulkPolicyMembersByPolicyNo(String policyNo);
}