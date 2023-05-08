package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.PolicyLevelConversionControllerService;

@RestController
@RequestMapping("/policyLevelConversionController")
public class PolicyLevelConversionController {

    @Autowired
    private PolicyLevelConversionControllerService policyLevelConversionControllerService;
    
    @PostMapping("/savePolicyConversionDetails")
    public PolicyLevelConversionDto savePolicyConversionDetails(@RequestBody @Valid PolicyLevelConversionDto policyLevelConversionDto) {
        return policyLevelConversionControllerService.savePolicyConversionDetails(policyLevelConversionDto);
    }
    
}