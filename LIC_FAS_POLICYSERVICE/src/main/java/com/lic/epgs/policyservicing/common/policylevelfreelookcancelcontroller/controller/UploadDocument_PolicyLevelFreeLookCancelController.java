package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.PolicyServiceDocumentTempModel;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.UploadDocument_PolicyLevelFreeLookCancelControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/document/")
public class UploadDocument_PolicyLevelFreeLookCancelController {

    @Autowired
    private UploadDocument_PolicyLevelFreeLookCancelControllerService uploadDocument_PolicyLevelFreeLookCancelControllerService;

    @GetMapping("/{documentId}")
    public PolicyServiceDocumentTempModel getDocumentById(@PathVariable("documentId") long documentId) {
        return uploadDocument_PolicyLevelFreeLookCancelControllerService.getDocumentById(documentId);
    }

}