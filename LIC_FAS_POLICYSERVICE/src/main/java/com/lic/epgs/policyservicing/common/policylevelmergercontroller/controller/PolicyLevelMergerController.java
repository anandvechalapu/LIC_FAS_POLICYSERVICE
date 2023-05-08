package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyServiceDocumentDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerControllerService;

@RestController
public class PolicyLevelMergerController {
 
    @Autowired
    private PolicyLevelMergerControllerService service;
 
    @GetMapping("/document/{mergeId}")
    public ResponseEntity<List<PolicyServiceDocumentDto>> getDocumentList(@PathVariable String mergeId) {
        return service.getDocumentList(mergeId);
    }
}