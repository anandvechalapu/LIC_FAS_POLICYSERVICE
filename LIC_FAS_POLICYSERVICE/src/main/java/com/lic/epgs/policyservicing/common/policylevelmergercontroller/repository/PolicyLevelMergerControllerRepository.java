package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerSearchDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyLevelMergerControllerRepository extends JpaRepository<PolicyLevelMergerApiResponse, Long>, JpaSpecificationExecutor<PolicyLevelMergerApiResponse> {

    @Query("SELECT p FROM PolicyLevelMergerApiResponse p WHERE p.policyNumber = ?1 AND p.product = ?2 AND p.lineOfBusiness = ?3 AND p.mergeStatus = ?4 AND p.unitCode = ?5 AND p.mphCode = ?6 AND p.mphName = ?7 ORDER BY p.modificationDate DESC ")
    List<PolicyLevelMergerSearchDto> getCriteriaSearchPolicy(String policyNumber, String product, String lineOfBusiness, String mergeStatus, String unitCode, String mphCode, String mphName);
}