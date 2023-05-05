package com.lic.epgs.fund.interestfundcontroller.repository;

import com.lic.epgs.fund.interestfundcontroller.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FundInterestFundControllerRepository extends JpaRepository<Policy, Long> {

    Optional<Policy> findLatestPolicyByPolicyNo(String policyNo);

}

package com.lic.epgs.fund.interestfundcontroller.controller;

import com.lic.epgs.fund.interestfundcontroller.model.Policy;
import com.lic.epgs.fund.interestfundcontroller.service.FundInterestFundControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/policies")
public class FundInterestFundController {

    @Autowired
    private FundInterestFundControllerService fundInterestFundControllerService;

    @GetMapping("/{policyNo}")
    public Optional<Policy> getLatestPolicyByPolicyNo(@PathVariable String policyNo) {
        return fundInterestFundControllerService.findLatestPolicyByPolicyNo(policyNo);
    }
}