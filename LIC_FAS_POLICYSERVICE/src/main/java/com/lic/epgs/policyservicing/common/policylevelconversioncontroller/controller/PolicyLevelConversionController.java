package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.PolicyServiceNotesTempEntity;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.SavePolicyConversionNotes_PolicyLevelConversionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/policyLevelConversionController")
public class PolicyLevelConversionController {

    @Autowired
    private SavePolicyConversionNotes_PolicyLevelConversionControllerService savePolicyConversionNotes_PolicyLevelConversionControllerService;

    @GetMapping("/getNotes/{policyId}")
    public Optional<PolicyServiceNotesTempEntity> getNotesByPolicyId(@PathVariable String policyId) {
        return savePolicyConversionNotes_PolicyLevelConversionControllerService.getPolicyServiceNotesTempEntityByPolicyId(policyId);
    }

    @PostMapping("/saveNotes")
    public PolicyServiceNotesTempEntity saveNotes(@RequestBody PolicyServiceNotesTempEntity policyServiceNotesTempEntity) {
        return savePolicyConversionNotes_PolicyLevelConversionControllerService.savePolicyServiceNotesTempEntity(policyServiceNotesTempEntity);
    }

}