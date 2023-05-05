package com.lic.epgs.fund.interestratelogcontroller.service;

import com.lic.epgs.fund.interestratelogcontroller.repository.FundInterestRateLogControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FundInterestRateLogControllerService {

    @Autowired
    private FundInterestRateLogControllerRepository fundInterestRateLogControllerRepository;

    public ResponseEntity<?> getErrorLogForPolicyNo(String policyNo) {
        return fundInterestRateLogControllerRepository.getErrorLogForPolicyNo(policyNo);
    }

    public ResponseEntity<?> getErrorLogsForPolicyNo(String policyNo) {
        return fundInterestRateLogControllerRepository.getErrorLogsForPolicyNo(policyNo);
    }

    public ResponseEntity<?> getEmptyErrorLogsForPolicyNo(String policyNo) {
        return fundInterestRateLogControllerRepository.getEmptyErrorLogsForPolicyNo(policyNo);
    }

    public ResponseEntity<?> getErrorMessageForPolicyNo(String policyNo) {
        return fundInterestRateLogControllerRepository.getErrorMessageForPolicyNo(policyNo);
    }
}