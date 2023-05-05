package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommonCommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.InprogressSearchOtherCriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/common/memberlvl/inprogress")
public class InprogressSearchOtherCriteriaController {

    @Autowired
    private InprogressSearchOtherCriteriaService inprogressSearchOtherCriteriaService;

    @GetMapping
    public ResponseEntity<CommonCommissionDto> findBySearchParamsAndRole(@RequestParam String role, @RequestBody CommissionSearchDto searchParams) {
        return inprogressSearchOtherCriteriaService.findBySearchParamsAndRole(role, searchParams);
    }
}