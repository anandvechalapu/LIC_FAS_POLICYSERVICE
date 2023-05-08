package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyLevelMemberAdditionController;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.PolicyLevelMemberAdditionControllerRepository;

@Service
public class PolicyLevelMemberAdditionControllerService {

    @Autowired
    private PolicyLevelMemberAdditionControllerRepository repository;

    public Optional<Long> getMaxLicenseId(){
        return repository.getMaxLicenseId();
    }

    public Optional<PolicyLevelMemberAdditionController> findByLicenseId(Long licenseId){
        return repository.findByLicenseId(licenseId);
    }

}