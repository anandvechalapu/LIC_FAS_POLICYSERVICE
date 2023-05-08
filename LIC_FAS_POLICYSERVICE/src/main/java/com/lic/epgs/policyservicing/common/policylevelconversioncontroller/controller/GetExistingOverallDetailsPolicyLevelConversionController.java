package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.GetExistingOverallDetailsPolicyLevelConversionControllerModel;

public interface GetExistingOverallDetailsPolicyLevelConversionControllerRepository extends JpaRepository<GetExistingOverallDetailsPolicyLevelConversionControllerModel, Long> {

    Object getExistingOverallDetails(Long serviceId);

}

package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.GetExistingOverallDetailsPolicyLevelConversionControllerService;

@RestController
@RequestMapping("/getExistingOverallDetailsPolicyLevelConversionController")
public class GetExistingOverallDetailsPolicyLevelConversionController {

    @Autowired
    GetExistingOverallDetailsPolicyLevelConversionControllerService getExistingOverallDetailsPolicyLevelConversionControllerService;

    @GetMapping("/{serviceId}")
    public Object getExistingOverallDetails(@PathVariable Long serviceId) {
        return getExistingOverallDetailsPolicyLevelConversionControllerService.getExistingOverallDetails(serviceId);
    }

}