package com.lic.epgs.fund.policyinterestratefundcontroller.controller;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.AccountingIntegrationRequestDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.model.SuperAnnuationResponseModel;
import com.lic.epgs.fund.policyinterestratefundcontroller.service.GetMphAndIcodeDetail_PolicyInterestRateFundController7Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/superannuation")
public class GetMphAndIcodeDetail_PolicyInterestRateFundController7Controller {

    @Autowired
    private GetMphAndIcodeDetail_PolicyInterestRateFundController7Service getMphAndIcodeDetail_PolicyInterestRateFundController7Service;

    @PostMapping
    public ResponseEntity<Object> getSuperAnnuationResponse(@RequestBody AccountingIntegrationRequestDto requestDto) {
        return getMphAndIcodeDetail_PolicyInterestRateFundController7Service.getSuperAnnuationResponse(requestDto);
    }

}