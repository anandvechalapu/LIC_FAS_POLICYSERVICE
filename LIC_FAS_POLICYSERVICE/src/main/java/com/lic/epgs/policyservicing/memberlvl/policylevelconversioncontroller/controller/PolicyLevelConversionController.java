package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.ExistingPolicyConversionDetails;

public interface GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository extends JpaRepository<ExistingPolicyConversionDetails, Long> {
    List<ExistingPolicyConversionDetails> findByRoleAndUnitCode(String role, String unitCode);
}

package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.ExistingPolicyConversionDetails;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service.GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService;

@RestController
@RequestMapping("/api")
public class PolicyLevelConversionController {

    @Autowired
    GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService existingPolicyConversionDetailsListService;

    @PostMapping("/existingpolicyconversiondetails")
    public ExistingPolicyConversionDetails createExistingPolicyConversionDetails(@Valid @RequestBody ExistingPolicyConversionDetails existingPolicyConversionDetails) {
        return existingPolicyConversionDetailsListService.save(existingPolicyConversionDetails);
    }

    @GetMapping("/existingpolicyconversiondetails/{role}/{unitCode}")
    public ResponseEntity<List<ExistingPolicyConversionDetails>> getExistingPolicyConversionDetailsListByRoleAndUnitCode(@PathVariable(value = "role") String role,
                                                                                                                     @PathVariable(value = "unitCode") String unitCode) {
        List<ExistingPolicyConversionDetails> existingPolicyConversionDetailsList = existingPolicyConversionDetailsListService.GetExistingPolicyConversionDetailsList_PolicyLevelConversionController(role, unitCode);
        if (existingPolicyConversionDetailsList == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(existingPolicyConversionDetailsList);
    }
}