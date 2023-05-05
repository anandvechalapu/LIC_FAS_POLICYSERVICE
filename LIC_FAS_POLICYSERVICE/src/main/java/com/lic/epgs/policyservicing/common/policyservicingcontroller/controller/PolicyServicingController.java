package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.SavePolicyServiceNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyServicingController {

    @Autowired
    private SavePolicyServiceNotesService savePolicyServiceNotesService;

    @PostMapping("/savePolicyServiceNotes")
    public CommonResponseDto savePolicyServiceNotes(@RequestParam("serviceId") String serviceId,
            @RequestParam("policyId") String policyId, @RequestParam("serviceType") String serviceType,
            @RequestParam("role") String role, @RequestParam("page") int page,
            @RequestParam("note") String note) {
        return savePolicyServiceNotesService.savePolicyServiceNotes(serviceId, policyId, serviceType, role, page, note);
    }

}