package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.PolicyLevelConversion;

@Repository
public interface GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversion, Long> {

    @Query("SELECT p FROM PolicyLevelConversion p WHERE p.role = (:role) AND p.unitCode = (:unitCode) AND p.conversionStatus = 'Inprogress'")
    List<PolicyLevelConversion> getInprogressPolicyConversionDetailsList(String role, String unitCode);
    
}

package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.PolicyLevelConversion;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerService;

@RestController
@RequestMapping("/policylevelconversion")
public class PolicyLevelConversionController {

    @Autowired
    private GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerService service;

    @GetMapping("/getInprogressPolicyConversionDetailsList")
    public List<PolicyLevelConversion> getInprogressPolicyConversionDetailsList(@RequestParam String role, @RequestParam String unitCode) {
        return service.getInprogressPolicyConversionDetailsList(role, unitCode);
    }

}