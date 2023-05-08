package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyLevelMemberAdditionController;

@Repository
public interface PolicyLevelMemberAdditionControllerRepository extends JpaRepository<PolicyLevelMemberAdditionController, Long> {

    @Query("SELECT MAX(licenseId) FROM PolicyLevelMemberAdditionController")
    Optional<Long> getMaxLicenseId();
 
    Optional<PolicyLevelMemberAdditionController> findByLicenseId(Long licenseId);

}

package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyLevelMemberAdditionController;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.PolicyLevelMemberAdditionControllerService;

@RestController
@RequestMapping("/policylevelmemberaddition")
public class PolicyLevelMemberAdditionController {
    @Autowired
    private PolicyLevelMemberAdditionControllerService policyLevelMemberAdditionControllerService;

    @GetMapping("/maxlicenseid")
    public Optional<Long> getMaxLicenseId(){
        return policyLevelMemberAdditionControllerService.getMaxLicenseId();
    }

    @GetMapping("/{licenseId}")
    public Optional<PolicyLevelMemberAdditionController> getByLicenseId(@PathVariable Long licenseId){
        return policyLevelMemberAdditionControllerService.findByLicenseId(licenseId);
    }

    @PostMapping
    public PolicyLevelMemberAdditionController save(@RequestBody PolicyLevelMemberAdditionController policyLevelMemberAdditionController){
        return policyLevelMemberAdditionControllerService.save(policyLevelMemberAdditionController);
    }

}