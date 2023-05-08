package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.PolicyServiceNotes;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.PolicyServiceNotesService;

@RestController
@RequestMapping("/api/policylevelconversioncontroller")
public class PolicyLevelConversionController {

    @Autowired
    private PolicyServiceNotesService policyServiceNotesService;

    @GetMapping("/notes/{serviceId}")
    public List<PolicyServiceNotes> getNotesDetailsList_PolicyLevelConversionController(@PathVariable Long serviceId) {
        return policyServiceNotesService.getNotesDetailsList_PolicyLevelConversionController(serviceId);
    }

}