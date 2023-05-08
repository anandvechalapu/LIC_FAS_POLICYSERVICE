package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.PolicyServiceMemberAdditionEntity;

@Repository
public interface SendToMaker_PolicyLevelMemberAdditionController extends JpaRepository<PolicyServiceMemberAdditionEntity, Long> {

    @Modifying
    @Query(value = "UPDATE PolicyServiceMemberAdditionEntity p SET p.memberAdditionStatus = :memberAdditionStatus, p.modifiedBy = :modifiedBy, p.modifiedOn = :modifiedOn WHERE p.memberAdditionId = :memberAdditionId AND p.unitCode = :unitCode")
    void sendToMakerOrChecker(@Param("memberAdditionStatus") String memberAdditionStatus, @Param("modifiedBy") String modifiedBy, @Param("modifiedOn") String modifiedOn,
            @Param("memberAdditionId") Long memberAdditionId, @Param("unitCode") String unitCode);

}