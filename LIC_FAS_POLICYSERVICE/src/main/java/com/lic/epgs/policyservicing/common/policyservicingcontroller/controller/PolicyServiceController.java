package com.lic.epgs.policyservicing.common.policyservicingcontroller.repository;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyServiceModuleDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyServiceDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavePolicyServiceRepository extends JpaRepository<PolicyServiceModuleDto, Long> {
    CommonResponseDto<PolicyServiceDto> savePolicyService(PolicyServiceModuleDto policyServiceModuleDto);
}

package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyServiceModuleDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.SavePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyServiceController {

    @Autowired
    SavePolicyService savePolicyService;

    @PostMapping("/savepolicyservice")
    public CommonResponseDto<PolicyServiceDto> savePolicyService(@RequestBody PolicyServiceModuleDto policyServiceModuleDto) {
        return savePolicyService.savePolicyService(policyServiceModuleDto);
    }

}