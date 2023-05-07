package com.lic.epgs.surrender.service;

import java.util.Date;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.surrender.repository.SurrenderPayoutCalculationRepository;

@Service
@Transactional
public class SurrenderPayoutCalculationService {

    private SurrenderPayoutCalculationRepository surrenderPayoutCalculationRepository;

    public SurrenderPayoutCalculationService(SurrenderPayoutCalculationRepository surrenderPayoutCalculationRepository) {
        this.surrenderPayoutCalculationRepository = surrenderPayoutCalculationRepository;
    }

    public JSONObject calculateSurrenderPayout(String policyId, Date surrenderReqDate, Double fundValue, String modeOfPay, int noOfInstallment) {
        return surrenderPayoutCalculationRepository.calculateSurrenderPayout(policyId, surrenderReqDate, fundValue, modeOfPay, noOfInstallment);
    }

    public JSONObject handleError(String policyId, Date surrenderReqDate, Double fundValue, String modeOfPay, int noOfInstallment) {
        return surrenderPayoutCalculationRepository.handleError(policyId, surrenderReqDate, fundValue, modeOfPay, noOfInstallment);
    }

    public JSONObject handleException() {
        return surrenderPayoutCalculationRepository.handleException();
    }

}