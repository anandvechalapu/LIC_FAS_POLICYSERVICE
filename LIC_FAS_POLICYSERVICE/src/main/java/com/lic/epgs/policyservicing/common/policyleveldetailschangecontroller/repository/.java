package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.entity.PolicyServiceNotesTempEntity;

@Repository
public interface PolicyServiceNotesTempRepo extends JpaRepository<PolicyServiceNotesTempEntity, Long> {
  
  public PolicyServiceNotesTempEntity findByPolicyIdAndServiceId(Long policyId, Long serviceId);
  
}