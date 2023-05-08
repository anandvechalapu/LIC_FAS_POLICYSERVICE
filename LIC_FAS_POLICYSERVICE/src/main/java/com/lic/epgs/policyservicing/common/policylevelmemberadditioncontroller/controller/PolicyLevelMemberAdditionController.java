package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import java.util.Date;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.PolicyLevelMemberAdditionControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyLevelMemberAdditionController {

    @Autowired
    private PolicyLevelMemberAdditionControllerService service;

    @PostMapping("/saveNote")
    public CommonResponseDto saveNote(@RequestParam("memberAdditionId") String memberAdditionId,
        @RequestParam("note") String note, @RequestParam("createdBy") String createdBy,
        @RequestParam("createdOn") Date createdOn) {
        return service.saveNote(memberAdditionId, note, createdBy, createdOn);
    }
}