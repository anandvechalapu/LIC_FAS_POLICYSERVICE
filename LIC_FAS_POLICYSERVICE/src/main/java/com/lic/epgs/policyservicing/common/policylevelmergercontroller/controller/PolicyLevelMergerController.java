package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyServiceDocumentDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerControllerService;

@RestController
@RequestMapping("/policyLevelMergerController")
public class PolicyLevelMergerController {
    
    @Autowired
    private PolicyLevelMergerControllerService policyLevelMergerControllerService;

    @GetMapping("/{mergeId}")
    public List<PolicyServiceDocumentDto> getDocumentList(@PathVariable("mergeId") Long mergeId) {
        return policyLevelMergerControllerService.getDocumentList(mergeId);
    }
}