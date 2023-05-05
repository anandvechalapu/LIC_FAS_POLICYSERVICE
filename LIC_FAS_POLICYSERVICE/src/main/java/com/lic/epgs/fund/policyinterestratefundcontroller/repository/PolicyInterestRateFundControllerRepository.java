package com.lic.epgs.fund.policyinterestratefundcontroller.repository;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponseDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyInterestRateFundControllerRepository extends JpaRepository<InterestRateResponseDto, String> {

    /**
     * Method to credit a policy by policy number
     *
     * @param policyNo
     * @return InterestRateResponseDto
     * @throws ApplicationException
     */
    InterestRateResponseDto creditPolicy(String policyNo) throws ApplicationException;
}