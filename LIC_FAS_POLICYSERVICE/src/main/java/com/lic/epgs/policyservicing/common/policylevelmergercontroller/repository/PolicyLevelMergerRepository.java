package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTempEntity;

@Repository
public interface PolicyLevelMergerRepository extends JpaRepository<PolicyLevelMergerTempEntity, Long> {
 
    PolicyLevelMergerTempEntity getPolicyMergebyMergeId_PolicyLevelMergerController(Long mergeId);
}