package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service.PolicyConversionRejection_PolicyLevelConversionCheckerControllerService;

@RestController
public class PolicyLevelConversionCheckerController {

    @Autowired
    private PolicyConversionRejection_PolicyLevelConversionCheckerControllerService policyConversionRejection_PolicyLevelConversionCheckerControllerService;

    @PostMapping("/save/policyLevelConversion")
    public PolicyLevelConversionTempEntity save(@RequestBody PolicyLevelConversionTempEntity policyLevelConversionTempEntity) {
        return policyConversionRejection_PolicyLevelConversionCheckerControllerService.save(policyLevelConversionTempEntity);
    }

    @PostMapping("/update/policyLevelConversion")
    public int updatePolicyLevelConversionTempEntity(@RequestBody PolicyLevelConversionTempEntity policyLevelConversionTempEntity) {
        return policyConversionRejection_PolicyLevelConversionCheckerControllerService.updatePolicyLevelConversionTempEntity(policyLevelConversionTempEntity.getConversionId(), policyLevelConversionTempEntity.getRejectionReasonCode(), policyLevelConversionTempEntity.getRemarks(), policyLevelConversionTempEntity.getModifiedBy(), policyLevelConversionTempEntity.getModifiedOn());
    }
}