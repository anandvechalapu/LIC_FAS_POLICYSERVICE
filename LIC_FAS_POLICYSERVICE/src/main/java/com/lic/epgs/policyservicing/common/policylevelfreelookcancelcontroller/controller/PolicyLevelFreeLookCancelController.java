package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.PolicyLevelFreeLookCancelControllerModel;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.SaveBankDetails_PolicyLevelFreeLookCancelControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policyLevelFreeLookCancelController")
public class PolicyLevelFreeLookCancelController {

    @Autowired
    private SaveBankDetails_PolicyLevelFreeLookCancelControllerService saveBankDetails_PolicyLevelFreeLookCancelControllerService;

    @PostMapping("/saveBankDetails")
    public PolicyLevelFreeLookCancelControllerModel saveBankDetails(PolicyLevelFreeLookCancelControllerModel policyLevelFreeLookCancelControllerModel) {
        policyLevelFreeLookCancelControllerModel.setFreeLookCancellationResponseDto(saveBankDetails_PolicyLevelFreeLookCancelControllerService.saveBankDetails(policyLevelFreeLookCancelControllerModel.getPolicyBankOldDto()));
        return policyLevelFreeLookCancelControllerModel;
    }
}