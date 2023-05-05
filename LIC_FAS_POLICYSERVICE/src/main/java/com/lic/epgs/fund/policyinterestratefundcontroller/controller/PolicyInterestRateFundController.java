package com.lic.epgs.fund.policyinterestratefundcontroller.repository;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyInterestRateFundControllerRepository extends JpaRepository<InterestRateResponseDto, String> {

    InterestRateResponseDto debitMembersByPolicy(String policyNo);
}

package com.lic.epgs.fund.policyinterestratefundcontroller.controller;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.service.PolicyInterestRateFundControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyInterestRateFundController {

    @Autowired
    private PolicyInterestRateFundControllerService policyInterestRateFundControllerService;

    @GetMapping("/interestrate")
    public ResponseEntity<InterestRateResponseDto> getInterestRateByPolicyNumber(@RequestParam("policyNo") String policyNo) {
        InterestRateResponseDto interestRateResponseDto = policyInterestRateFundControllerService.getInterestRateByPolicyNumber(policyNo);
        return ResponseEntity.ok(interestRateResponseDto);
    }

}