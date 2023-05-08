package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerModel;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetExistingPolicyConversionDetailsList_PolicyLevelConversionController {

    @Autowired
    private GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService existingPolicyConversionDetailsList_PolicyLevelConversionControllerService;

    @GetMapping("/policylevelconversioncontroller/getexistingpolicyconversiondetailslist")
    public ResponseEntity<GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerModel> getExistingPolicyConversionDetailsList(@RequestParam("role") String role,
                                                                                                                                            @RequestParam("unitCode") String unitCode) throws Exception {
        List<Object> existingPolicyConversionDetailsList = existingPolicyConversionDetailsList_PolicyLevelConversionControllerService.getExistingPolicyConversionDetailsList(role, unitCode);
        return ResponseEntity.ok(new GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerModel(role, unitCode, existingPolicyConversionDetailsList));
    }

}