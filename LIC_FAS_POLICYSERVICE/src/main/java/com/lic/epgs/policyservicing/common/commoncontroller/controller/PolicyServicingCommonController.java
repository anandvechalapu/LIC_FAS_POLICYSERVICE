package com.lic.epgs.policyservicing.common.commoncontroller.controller;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.commoncontroller.entity.PolicyServiceEntity;
import com.lic.epgs.policyservicing.common.commoncontroller.service.PolicyServicingCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy-servicing-common")
public class PolicyServicingCommonController {

  @Autowired
  private PolicyServicingCommonService policyServicingCommonService;

  @GetMapping("/policy-entity/{policyId}")
  public PolicyServiceEntity getPolicyEntity(@PathVariable String policyId) {
    return policyServicingCommonService.findByPolicyId(policyId);
  }

  @PostMapping("/start-service")
  public PolicyServiceCommonResponseDto startService(@RequestBody PolicyServiceDto policyServiceDto,
      @RequestBody String serviceType) {
    return policyServicingCommonService.startService(policyServiceDto, serviceType);
  }

}