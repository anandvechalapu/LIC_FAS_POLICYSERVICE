package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.entity.PolicyLevelMergerEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerSearchDto;

@Repository
public interface PolicyLevelMergerRepository extends JpaRepository<PolicyLevelMergerEntity, Long> {
    
    @Query("SELECT p FROM PolicyLevelMergerEntity p WHERE p.policyNumber = :policyNumber AND p.product = :product AND p.lineOfBusiness = :lineOfBusiness AND p.mergeStatus = :mergeStatus AND p.unitCode = :unitCode AND p.mphCode = :mphCode AND p.mphName = :mphName AND p.isActive = true ORDER BY modifiedOn DESC")
    List<PolicyLevelMergerSearchDto> getExistingCriteriaSearchPolicy(String policyNumber, String product, String lineOfBusiness, Integer mergeStatus, String unitCode, String mphCode, String mphName);

}