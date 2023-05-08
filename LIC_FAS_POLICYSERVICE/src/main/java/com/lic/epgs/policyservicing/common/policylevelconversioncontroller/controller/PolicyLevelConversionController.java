package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversionDto, Long> {
    CommonResponseDto getPolicyConversionDetailsByPolicyNo(String prevPolicyNo, String role);
}

package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.PolicyLevelConversionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/policylevelconversioncontroller")
public class PolicyLevelConversionController {

    @Autowired
    private PolicyLevelConversionControllerService policyLevelConversionControllerService;

    @GetMapping("/getpolicyconversiondetailsbypolicyno")
    public CommonResponseDto getPolicyConversionDetailsByPolicyNo(@RequestParam String prevPolicyNo, @RequestParam String role) {
        return policyLevelConversionControllerService.getPolicyConversionDetailsByPolicyNo(prevPolicyNo, role);
    }
}