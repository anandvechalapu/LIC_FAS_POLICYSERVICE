package com.lic.epgs.fund.policyinterestratefundcontroller.repository;

import com.lic.epgs.fund.policyinterestratefundcontroller.dto.InterestRateResponseDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberCreditRepository extends JpaRepository<InterestRateResponseDto, String> {

    @Query("SELECT m FROM InterestRateResponseDto m WHERE m.policyNo = :policyNo")
    InterestRateResponseDto findByPolicyNumber(String policyNo);

}