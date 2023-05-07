package com.lic.epgs.surrender.controller;

import com.lic.epgs.surrender.model.PolicySearchForSurrender;
import com.lic.epgs.surrender.service.PolicySearchForSurrenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/policy")
public class PolicySearchForSurrenderController {

    @Autowired
    private PolicySearchForSurrenderService policySearchForSurrenderService;

    @GetMapping("/{policyNumber}")
    public PolicySearchForSurrender getPolicyDetailsByPolicyNumber(@PathVariable int policyNumber) {
        return policySearchForSurrenderService.getPolicyDetailsByPolicyNumber(policyNumber);
    }

    @PostMapping("/check")
    public boolean isPolicyNumberExists(@RequestBody int policyNumber) {
        return policySearchForSurrenderService.isPolicyNumberExists(policyNumber);
    }

    @PostMapping("/response")
    public PolicySearchForSurrender getResponseObject(@RequestBody int policyNumber) {
        return policySearchForSurrenderService.getResponseObject(policyNumber);
    }

    @PostMapping("/error")
    public String getErrorMessage(@RequestBody int policyNumber) {
        return policySearchForSurrenderService.getErrorMessage(policyNumber);
    }

    @PostMapping("/status")
    public String getTransactionStatus(@RequestBody int policyNumber) {
        return policySearchForSurrenderService.getTransactionStatus(policyNumber);
    }

    @PostMapping("/message")
    public String getTransactionMessage(@RequestBody int policyNumber) {
        return policySearchForSurrenderService.getTransactionMessage(policyNumber);
    }
}