package com.lic.epgs.fund.policyinterestratefundcontroller.repository;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyInterestRateFundControllerRepository extends JpaRepository<InterestRateResponseDto, String> {
    InterestRateResponseDto debitMembersByPolicy(String policyNo);
}