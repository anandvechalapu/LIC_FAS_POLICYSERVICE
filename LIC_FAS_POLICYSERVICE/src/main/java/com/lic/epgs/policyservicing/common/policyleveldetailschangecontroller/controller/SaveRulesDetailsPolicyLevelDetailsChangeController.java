package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.SaveRulesDetailsPolicyLevelDetailsChangeControllerService;

@RestController
public class SaveRulesDetailsPolicyLevelDetailsChangeController {

    @Autowired
    SaveRulesDetailsPolicyLevelDetailsChangeControllerService saveRulesDetailsPolicyLevelDetailsChangeControllerService;

    @PostMapping(value = "/policyLevelDetailsChange/saveRulesDetails")
    public ResponseEntity<Object> saveRulesDetails(@RequestBody PolicyRulesDto policyRulesDto) {
        PolicyRulesDto savedDto = saveRulesDetailsPolicyLevelDetailsChangeControllerService.saveRulesDetails(policyRulesDto);
        return new ResponseEntity<>(savedDto, HttpStatus.OK);
    }

}