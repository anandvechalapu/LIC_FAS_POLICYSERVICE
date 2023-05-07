package com.lic.epgs.surrender.controller;

import java.util.Date;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.surrender.service.SurrenderPayoutCalculationService;

@RestController
@RequestMapping("/surrenderpayout")
public class SurrenderPayoutCalculationController {

    @Autowired
    SurrenderPayoutCalculationService surrenderPayoutCalculationService;

    @PostMapping
    public JSONObject calculateSurrenderPayout(@RequestBody String policyId, Date surrenderReqDate, Double fundValue, String modeOfPay, int noOfInstallment) {
        return surrenderPayoutCalculationService.calculateSurrenderPayout(policyId, surrenderReqDate, fundValue, modeOfPay, noOfInstallment);
    }
}