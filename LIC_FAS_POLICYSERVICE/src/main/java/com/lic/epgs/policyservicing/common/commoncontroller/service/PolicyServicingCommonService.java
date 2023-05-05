package com.lic.epgs.policyservicing.common.commoncontroller.service;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.commoncontroller.entity.PolicyServiceEntity;
import com.lic.epgs.policyservicing.common.commoncontroller.repository.PolicyServicingCommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyServicingCommonService {

  @Autowired
  private PolicyServicingCommonRepository policyServicingCommonRepository;

  public PolicyServiceEntity findByPolicyId(String policyId) {
    return policyServicingCommonRepository.findByPolicyId(policyId);
  }

  public PolicyServiceCommonResponseDto startService(PolicyServiceDto policyServiceDto, String serviceType) {
    return policyServicingCommonRepository.startService(policyServiceDto, serviceType);
  }

}