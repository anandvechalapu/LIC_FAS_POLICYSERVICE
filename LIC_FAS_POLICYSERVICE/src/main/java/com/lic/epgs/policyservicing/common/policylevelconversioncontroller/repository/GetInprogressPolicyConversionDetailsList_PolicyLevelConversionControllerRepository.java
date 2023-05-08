package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.PolicyLevelConversion;

import java.util.List;

public interface GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversion, Long> {
    @Query("SELECT p FROM PolicyLevelConversion p WHERE p.conversionStatus = 'in-progress' AND p.unitCode = :unitCode AND p.role = :role ORDER BY p.modifiedDate DESC")
    List<PolicyLevelConversion> getInprogressPolicyConversionDetailsList(@Param("role") String role, @Param("unitCode") String unitCode);
}