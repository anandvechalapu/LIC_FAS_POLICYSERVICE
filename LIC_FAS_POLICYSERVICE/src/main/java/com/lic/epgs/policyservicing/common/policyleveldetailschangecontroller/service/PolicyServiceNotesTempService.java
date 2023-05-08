package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.entity.PolicyServiceNotesTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.PolicyServiceNotesTempRepo;

@Service
public class PolicyServiceNotesTempService {
  
  @Autowired
  private PolicyServiceNotesTempRepo policyServiceNotesTempRepo;
  
  public PolicyServiceNotesTempEntity findByPolicyIdAndServiceId(Long policyId, Long serviceId) {
    return policyServiceNotesTempRepo.findByPolicyIdAndServiceId(policyId, serviceId);
  }
  
  public List<PolicyServiceNotesTempEntity> findAll() {
    return policyServiceNotesTempRepo.findAll();
  }
  
  public PolicyServiceNotesTempEntity save(PolicyServiceNotesTempEntity policyServiceNotesTempEntity) {
    return policyServiceNotesTempRepo.save(policyServiceNotesTempEntity);
  }

}