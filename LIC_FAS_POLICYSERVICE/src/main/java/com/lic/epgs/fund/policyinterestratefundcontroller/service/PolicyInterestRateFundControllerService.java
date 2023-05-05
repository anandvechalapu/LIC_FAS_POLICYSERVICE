package com.lic.epgs.fund.policyinterestratefundcontroller.service;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.repository.PolicyInterestRateFundControllerRepository;
import org.springframework.stereotype.Service;

@Service
public class PolicyInterestRateFundControllerService {

    private final PolicyInterestRateFundControllerRepository policyInterestRateFundControllerRepository;

    public PolicyInterestRateFundControllerService(PolicyInterestRateFundControllerRepository policyInterestRateFundControllerRepository) {
        this.policyInterestRateFundControllerRepository = policyInterestRateFundControllerRepository;
    }

    public InterestRateResponseDto getInterestRateByPolicyNumber(String policyNo) {
        return policyInterestRateFundControllerRepository.debitMembersByPolicy(policyNo);
    }

}