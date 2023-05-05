package com.lic.epgs.policyservicing.common.commoncontroller.repository;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyServicingCommonRepository extends JpaRepository<PolicyServiceCommonResponseDto, Long> {

    @Query("SELECT p FROM PolicyServiceCommonResponseDto p WHERE p.policyId = ?1")
    PolicyServiceCommonResponseDto getServiceDetailsByPolicyId(Long policyId);

}

package com.lic.epgs.policyservicing.common.commoncontroller.controller;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.service.PolicyServicingCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policyServicing")
public class PolicyServicingCommonController {

    @Autowired
    private PolicyServicingCommonService policyServicingCommonService;

    @GetMapping("/{policyId}")
    public PolicyServiceCommonResponseDto getServiceDetailsByPolicyId(@PathVariable Long policyId) {
        return policyServicingCommonService.getServiceDetailsByPolicyId(policyId);
    }

}