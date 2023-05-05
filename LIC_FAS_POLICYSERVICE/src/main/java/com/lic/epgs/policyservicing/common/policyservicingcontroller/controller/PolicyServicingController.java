package com.lic.epgs.policyservicing.common.policyservicingcontroller.repository;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDocumentDto;

public interface PolicyServicingControllerRepository {
    CommonResponseDto savePolicyServiceDocument(PolicyServiceDocumentDto policyServiceDocumentDto);
}

package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDocumentDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.PolicyServicingControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyServicingController {

    @Autowired
    private PolicyServicingControllerService policyServicingControllerService;

    @PostMapping("/save-policy-service-document")
    public CommonResponseDto savePolicyServiceDocument(@RequestBody PolicyServiceDocumentDto policyServiceDocumentDto) {
        return policyServicingControllerService.savePolicyServiceDocument(policyServiceDocumentDto);
    }

}