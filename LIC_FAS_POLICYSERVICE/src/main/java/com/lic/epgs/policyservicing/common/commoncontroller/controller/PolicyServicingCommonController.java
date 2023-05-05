package com.lic.epgs.policyservicing.common.commoncontroller.model;

import org.springframework.data.repository.CrudRepository;

public interface PolicyServicingCommonRepository extends CrudRepository<PolicyServiceEntity, Long> {

    Long getSequence();

    PolicyServiceEntity findByPolicyIdAndServiceType(String policyId, String serviceType);
}

package com.lic.epgs.policyservicing.common.commoncontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.commoncontroller.model.PolicyServiceEntity;
import com.lic.epgs.policyservicing.common.commoncontroller.service.PolicyServicingCommonService;

@RestController
public class PolicyServicingCommonController {

    @Autowired
    private PolicyServicingCommonService policyServicingCommonService;

    @GetMapping("/sequence")
    public Long getSequence() {
        return policyServicingCommonService.getSequence();
    }

    @GetMapping("/policy/{policyId}/{serviceType}")
    public PolicyServiceEntity findByPolicyIdAndServiceType(@PathVariable("policyId") String policyId,
            @PathVariable("serviceType") String serviceType) {
        return policyServicingCommonService.findByPolicyIdAndServiceType(policyId, serviceType);
    }

    @PostMapping(value = "/policy")
    public PolicyServiceEntity savePolicyServiceEntity(PolicyServiceEntity policyServiceEntity) {
        return policyServicingCommonService.save(policyServiceEntity);
    }

}