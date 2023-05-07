package com.lic.epgs.surrender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.dto.MphBankDto;
import com.lic.epgs.dto.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.service.UpdatePolicyBankDetailsService;

@RestController
@RequestMapping("/surrender/updateBankDetails")
public class UpdatePolicyBankDetailsController {

    @Autowired
    private UpdatePolicyBankDetailsService updatePolicyBankDetailsService;

    @PostMapping
    public PolicySurrenderApiResponse updatePolicyBankDetails(@RequestBody MphBankDto mphBankDto) {
        return updatePolicyBankDetailsService.updatePolicyBankDetails(mphBankDto);
    }
}