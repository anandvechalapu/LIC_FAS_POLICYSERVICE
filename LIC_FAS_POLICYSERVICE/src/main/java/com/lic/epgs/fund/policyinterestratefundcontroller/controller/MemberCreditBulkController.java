package com.lic.epgs.fund.policyinterestratefundcontroller.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.MemberCreditBulk;
import com.lic.epgs.fund.policyinterestratefundcontroller.service.MemberCreditBulkService;

@RestController
@RequestMapping("/api/v1/membercreditbulk")
public class MemberCreditBulkController {

    private MemberCreditBulkService memberCreditBulkService;

    public MemberCreditBulkController(MemberCreditBulkService memberCreditBulkService){
        this.memberCreditBulkService = memberCreditBulkService;
    }

    @PostMapping
    public ResponseEntity<Object> creditInterestForMultiplePolicyMembers(@RequestBody MemberCreditBulk memberCreditBulk){
        return memberCreditBulkService.creditInterestForMultiplePolicyMembers(memberCreditBulk.getPolicyNo(), memberCreditBulk.getMemberIds());
    }

}