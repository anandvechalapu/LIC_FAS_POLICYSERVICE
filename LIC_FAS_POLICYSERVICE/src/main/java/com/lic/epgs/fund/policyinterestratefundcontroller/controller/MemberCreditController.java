package com.lic.epgs.fund.policyinterestratefundcontroller.repository;

import com.lic.epgs.fund.policyinterestratefundcontroller.dto.InterestRateResponseDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberCreditRepository extends JpaRepository<InterestRateResponseDto, String> {

    @Query("SELECT i FROM InterestRateResponseDto i WHERE i.policyNo = :policyNo")
    InterestRateResponseDto findByPolicyNumber(String policyNo);

}

package com.lic.epgs.fund.policyinterestratefundcontroller.controller;

import com.lic.epgs.fund.policyinterestratefundcontroller.dto.InterestRateResponseDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.service.MemberCreditService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberCreditController {

    @Autowired
    MemberCreditService memberCreditService;

    @GetMapping("/policy/{policyNo}/interestRate")
    public ResponseEntity<InterestRateResponseDto> getInterestRateByPolicyNumber(@PathVariable String policyNo) {
        return ResponseEntity.ok(memberCreditService.getInterestRateByPolicyNumber(policyNo));
    }
}