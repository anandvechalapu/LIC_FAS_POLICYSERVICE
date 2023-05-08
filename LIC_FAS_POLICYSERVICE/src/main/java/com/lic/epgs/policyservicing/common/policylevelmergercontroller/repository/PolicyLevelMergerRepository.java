package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;

public interface PolicyLevelMergerRepository extends JpaRepository<PolicyLevelMergerApiResponse, Long>{
    PolicyLevelMergerApiResponse getMasterPolicyMergebyMergeId(Long mergeId);
    PolicyLevelMergerDto findByMergeId(Long mergeId);
    PolicyServiceNotesDto findByMergeIdAndIsActive(Long mergeId, Boolean isActive);
}