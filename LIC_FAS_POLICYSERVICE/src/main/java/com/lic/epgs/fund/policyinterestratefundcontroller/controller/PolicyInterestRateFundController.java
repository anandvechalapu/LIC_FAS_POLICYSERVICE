package com.lic.epgs.fund.policyinterestratefundcontroller.controller;

import com.lic.epgs.fund.policyinterestratefundcontroller.dto.InterestRateResponseDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.model.PolicyInterestRateFundControllerModel;
import com.lic.epgs.fund.policyinterestratefundcontroller.service.PolicyInterestRateFundControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fund")
public class PolicyInterestRateFundController {

    @Autowired
    private PolicyInterestRateFundControllerService policyInterestRateFundControllerService;

    @PostMapping("/credit")
    public InterestRateResponseDto creditPolicyMemberByPolicyNo(@RequestBody PolicyInterestRateFundControllerModel model) {
        return policyInterestRateFundControllerService.creditPolicyMemberByPolicyNo(model.getPolicyNo());
    }

    @PostMapping("/credit-bulk")
    public InterestRateResponseDto creditBulkPolicyMembersByPolicyNo(@RequestBody PolicyInterestRateFundControllerModel model) {
        return policyInterestRateFundControllerService.creditBulkPolicyMembersByPolicyNo(model.getPolicyNo());
    }

    @PostMapping("/debit")
    public InterestRateResponseDto debitPolicyMemberByPolicyNoAndMemberId(@RequestBody PolicyInterestRateFundControllerModel model) {
        return policyInterestRateFundControllerService.debitPolicyMemberByPolicyNoAndMemberId(model.getPolicyNo(), model.getMemberId());
    }

    @PostMapping("/debit-bulk")
    public InterestRateResponseDto debitPolicyMembersByPolicyNo(@RequestBody PolicyInterestRateFundControllerModel model) {
        return policyInterestRateFundControllerService.debitPolicyMembersByPolicyNo(model.getPolicyNo());
    }

    @PostMapping("/debit-bulk-members")
    public InterestRateResponseDto debitBulkPolicyMembersByPolicyNo(@RequestBody PolicyInterestRateFundControllerModel model) {
        return policyInterestRateFundControllerService.debitBulkPolicyMembersByPolicyNo(model.getPolicyNo());
    }

}