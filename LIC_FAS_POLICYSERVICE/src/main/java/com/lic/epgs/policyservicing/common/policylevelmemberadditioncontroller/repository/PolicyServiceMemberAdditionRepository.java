package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.PolicyServiceMemberAdditionEntity;

@Repository
public interface PolicyServiceMemberAdditionRepository extends JpaRepository<PolicyServiceMemberAdditionEntity, Long> {
    
    // Method to find a PolicyServiceMemberAdditionEntity object by its memberAdditionId and unitCode properties
    PolicyServiceMemberAdditionEntity findByMemberAdditionIdAndUnitCode(Long memberAdditionId, String unitCode);

    // Method to update a PolicyServiceMemberAdditionEntity object
    PolicyServiceMemberAdditionEntity save(PolicyServiceMemberAdditionEntity policyServiceMemberAdditionEntity);
}