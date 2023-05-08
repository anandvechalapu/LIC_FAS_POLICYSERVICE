package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.SendToChecker_PolicyLevelConversionControllerService;

@RestController
public class PolicyLevelConversionController {

    @Autowired
    private SendToChecker_PolicyLevelConversionControllerService sendToChecker_PolicyLevelConversionControllerService;

    @GetMapping("/policyLevelConversion/{conversionId}")
    public PolicyLevelConversionTempEntity getByConversionId(@PathVariable String conversionId) {
        return sendToChecker_PolicyLevelConversionControllerService.findByConversionId(conversionId);
    }

    @PostMapping("/policyLevelConversion/save")
    public PolicyLevelConversionTempEntity save(@RequestBody PolicyLevelConversionTempEntity policyLevelConversionTempEntity) {
        return sendToChecker_PolicyLevelConversionControllerService.saveAndFlush(policyLevelConversionTempEntity);
    }

}