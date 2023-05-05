package com.lic.epgs.fund.policyinterestratefundcontroller.service;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.repository.PolicyInterestRateFundControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyInterestRateFundControllerService {

    @Autowired
    private PolicyInterestRateFundControllerRepository policyInterestRateFundControllerRepository;

    public InterestRateResponseDto creditPolicy(String policyNo) throws ApplicationException {
        return policyInterestRateFundControllerRepository.creditPolicy(policyNo);
    }
}