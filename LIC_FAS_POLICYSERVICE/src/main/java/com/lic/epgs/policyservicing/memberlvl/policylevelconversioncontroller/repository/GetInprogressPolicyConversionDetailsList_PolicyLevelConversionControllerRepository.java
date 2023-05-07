package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.entity.PolicyLevelConversionDetails;

public interface GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversionDetails, Long> {
    
    @Query("SELECT p FROM PolicyLevelConversionDetails p WHERE p.role = :role AND p.unitCode = :unitCode AND p.conversionStatus = 'in-progress' ORDER BY p.modifiedDate DESC")
    public List<PolicyLevelConversionDetails> getInProgressPolicyConversionDetails(@Param("role") String role, @Param("unitCode") String unitCode);
    
}