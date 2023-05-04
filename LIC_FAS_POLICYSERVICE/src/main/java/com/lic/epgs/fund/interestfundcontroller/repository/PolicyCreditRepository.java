package com.lic.epgs.fund.interestfundcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.fund.interestfundcontroller.model.InterestFundDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestRateResponseDto;

public interface PolicyCreditRepository extends JpaRepository<InterestFundDto, Long> {

    InterestRateResponseDto creditPolicy(InterestFundDto interestFundDto);

}