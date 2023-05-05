package com.lic.epgs.fund.interestfundcontroller.service;

import com.lic.epgs.fund.interestfundcontroller.repository.FundInterestFundControllerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FundInterestFundControllerService {

    private FundInterestFundControllerRepository fundInterestFundControllerRepository;

    public FundInterestFundControllerService(FundInterestFundControllerRepository fundInterestFundControllerRepository) {
        this.fundInterestFundControllerRepository = fundInterestFundControllerRepository;
    }

    public Optional<Policy> findLatestPolicyByPolicyNo(String policyNo) {
        return fundInterestFundControllerRepository.findLatestPolicyByPolicyNo(policyNo);
    }

}