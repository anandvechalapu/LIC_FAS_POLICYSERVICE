package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyConversionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyConversionDetails, Integer> {

    List<PolicyConversionDetails> getExistingPolicyConversionDetailsList(String role, String unitCode);

}


package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.controller;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyConversionDetails;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service.GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetExistingPolicyConversionDetailsList_PolicyLevelConversionController {

    @Autowired
    GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService service;

    @GetMapping("/getExistingPolicyConversionDetailsList")
    public ResponseEntity<List<PolicyConversionDetails>> getExistingPolicyConversionDetailsList(@RequestParam String role, @RequestParam String unitCode){
        List<PolicyConversionDetails> policyConversionDetailsList = service.getExistingPolicyConversionDetailsList(role, unitCode);
        return new ResponseEntity<>(policyConversionDetailsList, HttpStatus.OK);
    }

}