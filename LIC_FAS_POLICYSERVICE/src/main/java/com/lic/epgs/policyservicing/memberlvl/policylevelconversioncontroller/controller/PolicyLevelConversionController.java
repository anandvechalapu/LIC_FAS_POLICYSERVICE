package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.entity.PolicyLevelConversionDetails;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service.GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerService;

@RestController
@RequestMapping("/policylevelconversion")
public class PolicyLevelConversionController {

    @Autowired
    private GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerService service;

    @GetMapping("/getconversiondetails")
    public List<PolicyLevelConversionDetails> getInProgressPolicyConversionDetails(@RequestParam("role") String role, @RequestParam("unitCode") String unitCode) {
        return service.getInProgressPolicyConversionDetails(role, unitCode);
    }

}