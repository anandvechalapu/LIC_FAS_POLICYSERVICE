package com.lic.epgs.fund.interestratelogcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.fund.interestratelogcontroller.model.InterestRateLog;
import com.lic.epgs.fund.interestratelogcontroller.repository.InterestRateLogControllerRepository;

@Service
public class InterestRateLogControllerService {

    @Autowired
    private InterestRateLogControllerRepository interestRateLogControllerRepository;

    public List<InterestRateLog> findByIsFailTrueOrderByIdAsc() {
        return interestRateLogControllerRepository.findByIsFailTrueOrderByIdAsc();
    }

    public List<InterestRateLog> findByPolicyNoOrderByIdAsc(String policyNo) {
        return interestRateLogControllerRepository.findByPolicyNoOrderByIdAsc(policyNo);
    }

    public List<InterestRateLog> findByReferenceNoOrderByIdAsc(String referenceNo) {
        return interestRateLogControllerRepository.findByReferenceNoOrderByIdAsc(referenceNo);
    }

    public List<InterestRateLog> findAllByOrderByIdAsc() {
        return interestRateLogControllerRepository.findAllByOrderByIdAsc();
    }
}