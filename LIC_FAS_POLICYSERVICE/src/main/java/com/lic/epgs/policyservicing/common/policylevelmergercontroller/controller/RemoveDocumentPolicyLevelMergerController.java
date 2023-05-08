package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.RemoveDocumentPolicyLevelMergerControllerService;

@RestController
@RequestMapping("/policylevelmerger")
public class RemoveDocumentPolicyLevelMergerController {
    
    @Autowired
    private RemoveDocumentPolicyLevelMergerControllerService removeDocumentPolicyLevelMergerControllerService;
    
    @DeleteMapping("/remove/{documentId}/{mergeId}")
    public PolicyLevelMergerApiResponse removeDocument(@PathVariable Long documentId, @PathVariable Long mergeId) {
        return removeDocumentPolicyLevelMergerControllerService.removeDocument(documentId, mergeId);
    }
}