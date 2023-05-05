package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.controller;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.entity.PolicyLevelConversionEntity;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.entity.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service.PolicyLevelConversionCheckerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/policylevelconversioncheckercontroller")
public class PolicyLevelConversionCheckerController {

    @Autowired
    private PolicyLevelConversionCheckerControllerService policyLevelConversionCheckerControllerService;

    @PostMapping("/updateConversionStatus")
    @Transactional
    public void updateConversionStatus(@RequestBody Long conversionId) {
        policyLevelConversionCheckerControllerService.updateConversionStatus(conversionId);
    }

    @PostMapping("/updateConversionWorkflowStatus")
    @Transactional
    public void updateConversionWorkflowStatus(@RequestBody Long conversionId, @RequestBody String modifiedBy) {
        policyLevelConversionCheckerControllerService.updateConversionWorkflowStatus(conversionId, modifiedBy);
    }

    @PostMapping("/checkIfExists")
    public PolicyLevelConversionEntity checkIfExists(@RequestBody Long prevPolicyId) {
        return policyLevelConversionCheckerControllerService.checkIfExists(prevPolicyId);
    }

    @PostMapping("/saveNewPolicyLevelConversionEntity")
    @Transactional
    public void saveNewPolicyLevelConversionEntity(@RequestBody Long conversionId) {
        policyLevelConversionCheckerControllerService.saveNewPolicyLevelConversionEntity(conversionId);
    }

    @PostMapping("/saveNewPolicyServiceDocumentEntity")
    @Transactional
    public void saveNewPolicyServiceDocumentEntity(@RequestBody Long conversionId) {
        policyLevelConversionCheckerControllerService.saveNewPolicyServiceDocumentEntity(conversionId);
    }

    @PostMapping("/saveNewPolicyServiceNotesEntity")
    @Transactional
    public void saveNewPolicyServiceNotesEntity(@RequestBody Long serviceId) {
        policyLevelConversionCheckerControllerService.saveNewPolicyServiceNotesEntity(serviceId);
    }

}