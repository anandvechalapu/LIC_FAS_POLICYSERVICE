package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyLevelMemberAdditionController;

public interface PolicyLevelMemberAdditionControllerRepository extends JpaRepository<PolicyLevelMemberAdditionController, Long> {
 
    @Query("SELECT MAX(p.licenseId) FROM PolicyLevelMemberAdditionController p")
    Optional<Long> getMaxLicenseId();

    Optional<PolicyLevelMemberAdditionController> findByLicenseId(Long licenseId);
}