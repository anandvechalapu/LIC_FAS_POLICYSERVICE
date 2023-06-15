package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.PolicyLevelFreeLookCancelControllerService;

@RestController
@RequestMapping("/api/tableau")
public class PolicyLevelFreeLookCancelController {

    @Autowired
    private PolicyLevelFreeLookCancelControllerService policyLevelFreeLookCancelControllerService;

    @GetMapping("/datafeed")
    public List<Object> getTableauDataFeed() {
        return policyLevelFreeLookCancelControllerService.getTableauDataFeed();
    }

}