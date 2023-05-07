package com.lic.epgs.surrender.model;

import java.util.Date;

import org.json.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurrenderPayoutCalculation extends JpaRepository<SurrenderPayoutCalculation, Long> {
    JSONObject calculateSurrenderPayout(String policyId, Date surrenderReqDate, Double fundValue, String modeOfPay, int noOfInstallment);
    JSONObject handleError(String policyId, Date surrenderReqDate, Double fundValue, String modeOfPay, int noOfInstallment);
    JSONObject handleException();
}