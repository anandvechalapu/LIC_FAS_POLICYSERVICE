package com.lic.epgs.fund.policyinterestratefundcontroller.controller;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.Member;
import com.lic.epgs.fund.policyinterestratefundcontroller.service.MemberDebitPolicyInterestRateFundControllerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policyinterestratefundcontroller")
public class MemberDebitPolicyInterestRateFundControllerController {

    private final MemberDebitPolicyInterestRateFundControllerService memberDebitPolicyInterestRateFundControllerService;

    public MemberDebitPolicyInterestRateFundControllerController(MemberDebitPolicyInterestRateFundControllerService memberDebitPolicyInterestRateFundControllerService) {
        this.memberDebitPolicyInterestRateFundControllerService = memberDebitPolicyInterestRateFundControllerService;
    }

    @PostMapping("/debitPolicyMemberAccount")
    public ResponseEntity<Member> debitPolicyMemberAccount(@RequestParam String policyNo, @RequestParam String memberId) throws ApplicationException{
        return memberDebitPolicyInterestRateFundControllerService.debitPolicyMemberAccount(policyNo,memberId);
    }
}