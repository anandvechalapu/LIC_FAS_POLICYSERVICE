package com.lic.epgs.policyservicing.common.policyservicingcontroller.model;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceModuleDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exception.ApplicationException;

public class SavePolicyServiceModel {
  
  private SavePolicyServiceRepository savePolicyServiceRepository;
  
  public CommonResponseDto<PolicyServiceDto> savePolicyService(PolicyServiceModuleDto policyServiceModuleDto) throws ApplicationException {
    return savePolicyServiceRepository.savePolicyService(policyServiceModuleDto);
  }
  
  public CommonResponseDto<PolicyServiceDto> saveTempConversion() throws ApplicationException {
    return savePolicyServiceRepository.saveTempConversion();
  }
  
  public CommonResponseDto<PolicyServiceDto> saveTempPolicyModule() throws ApplicationException {
    return savePolicyServiceRepository.saveTempPolicyModule();
  }
  
  public void logError(String errorMessage) {
    savePolicyServiceRepository.logError(errorMessage);
  }
}