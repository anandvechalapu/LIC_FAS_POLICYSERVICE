package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.PolicyServiceDocumentTempEntity;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.PolicyServiceDocumentTempModel;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.PolicyLevelFreeLookCancelControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/policylevelfreelookcancel")
public class PolicyLevelFreeLookCancelController {

    @Autowired
    private PolicyLevelFreeLookCancelControllerService policyLevelFreeLookCancelControllerService;

    @PostMapping
    public PolicyServiceDocumentTempEntity save(@RequestBody PolicyServiceDocumentTempModel document) {
        return policyLevelFreeLookCancelControllerService.save(document);
    }

    @DeleteMapping("/{documentId}")
    public void deleteByDocumentId(@PathVariable("documentId") Long documentId) {
        policyLevelFreeLookCancelControllerService.deleteByDocumentId(documentId);
    }

    @GetMapping("/{documentId}")
    public PolicyServiceDocumentTempEntity findByDocumentId(@PathVariable("documentId") Long documentId) {
        return policyLevelFreeLookCancelControllerService.findByDocumentId(documentId);
    }

}