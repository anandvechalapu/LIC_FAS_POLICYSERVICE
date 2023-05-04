@Repository
public class InterestFundControllerRepository {

  public InterestRateResponseDto creditPolicyMembers(InterestFundDto interestFundDto) {
    // Implementation of Interest FundController Repository
  }

}

package com.lic.epgs.fund.interestfundcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.interestfundcontroller.model.InterestFundDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.interestfundcontroller.service.InterestFundControllerService;

@RestController
public class InterestFundController {

  @Autowired
  private InterestFundControllerService interestFundControllerService;

  @PostMapping(value = "/credit/policy/members")
  public InterestRateResponseDto creditPolicyMembers(@RequestBody InterestFundDto interestFundDto) {
    return interestFundControllerService.creditPolicyMembers(interestFundDto);
  }

}