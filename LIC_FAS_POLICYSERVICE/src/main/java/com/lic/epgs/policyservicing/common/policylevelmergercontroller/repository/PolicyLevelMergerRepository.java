package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTemp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface PolicyLevelMergerRepository extends JpaRepository<PolicyLevelMergerTemp, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE PolicyLevelMergerTemp SET isActive = :status, modifiedBy = :modifiedBy WHERE id = :id")
    void updateStatus(@Param("status") Boolean status, @Param("modifiedBy") String modifiedBy, @Param("id") Long id);

    void saveAndUpdatePolicyLevelMerger(PolicyLevelMergerDto policyLevelMergerDto, PolicyLevelMergerApiResponse response);

    boolean validPolicyNumberAndType(String policyNumber, String policyType);

}