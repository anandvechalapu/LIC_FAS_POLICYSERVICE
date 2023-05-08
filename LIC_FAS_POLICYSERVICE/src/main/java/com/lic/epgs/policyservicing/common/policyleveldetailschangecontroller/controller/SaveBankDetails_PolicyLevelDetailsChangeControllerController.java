package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.SaveBankDetails_PolicyLevelDetailsChangeController;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.SaveBankDetails_PolicyLevelDetailsChangeControllerService;

@RestController
public class SaveBankDetails_PolicyLevelDetailsChangeControllerController {

    @Autowired
    private SaveBankDetails_PolicyLevelDetailsChangeControllerService saveBankDetails_PolicyLevelDetailsChangeControllerService;

    @PostMapping("/saveBankDetails_PolicyLevelDetailsChangeController")
    void saveBankDetails_PolicyLevelDetailsChangeController(@RequestBody SaveBankDetails_PolicyLevelDetailsChangeController saveBankDetails_PolicyLevelDetailsChangeController) {
        saveBankDetails_PolicyLevelDetailsChangeControllerService.save(saveBankDetails_PolicyLevelDetailsChangeController);
    }

    @PostMapping("/findByMphBankId")
    SaveBankDetails_PolicyLevelDetailsChangeController findByMphBankId(@RequestBody Long mphBankId) {
        return saveBankDetails_PolicyLevelDetailsChangeControllerService.findByMphBankId(mphBankId);
    }

    @PostMapping("/updateBankDetails")
    void updateBankDetails(@RequestBody Long mphBankId) {
        saveBankDetails_PolicyLevelDetailsChangeControllerService.updateBankDetails(mphBankId);
    }

    @PostMapping("/logExecutionTime")
    void logExecutionTime(@RequestBody Date startTime, Date endTime) {
        saveBankDetails_PolicyLevelDetailsChangeControllerService.logExecutionTime(startTime, endTime);
    }

}