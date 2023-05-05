package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceModuleDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exception.ApplicationException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.SavePolicyServiceModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy-service")
public class SavePolicyServiceController {

  @Autowired
  private SavePolicyServiceModel savePolicyServiceModel;

  @PostMapping("/save")
  public ResponseEntity<CommonResponseDto<PolicyServiceDto>> savePolicyService(@RequestBody PolicyServiceModuleDto policyServiceModuleDto) throws ApplicationException {
    return ResponseEntity.ok(savePolicyServiceModel.savePolicyService(policyServiceModuleDto));
  }

  @PostMapping("/save-temp-conversion")
  public ResponseEntity<CommonResponseDto<PolicyServiceDto>> saveTempConversion() throws ApplicationException {
    return ResponseEntity.ok(savePolicyServiceModel.saveTempConversion());
  }

  @PostMapping("/save-temp-policy-module")
  public ResponseEntity<CommonResponseDto<PolicyServiceDto>> saveTempPolicyModule() throws ApplicationException {
    return ResponseEntity.ok(savePolicyServiceModel.saveTempPolicyModule());
  }

  @PostMapping("/log-error")
  public ResponseEntity<Void> logError(@RequestBody String errorMessage) {
    savePolicyServiceModel.logError(errorMessage);
    return ResponseEntity.ok().build();
  }

}