package com.lic.epgs.policyservicing.common.memberlvl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.CommissionTempService;

@RestController
public class CommissionTempController {

  @Autowired
  private CommissionTempService commissionTempService;

  @PostMapping("/checker/approve")
  public CommissionDto checkerApprove(@RequestParam int commissionId, @RequestParam String role) {
    return commissionTempService.checkerApprove(commissionId, role);
  }
  
}