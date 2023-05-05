package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommonCommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.InprogressSearchOtherCriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inprogress/search/other")
public class InprogressSearchOtherCriteriaController {

    @Autowired
    private InprogressSearchOtherCriteriaService inprogressSearchOtherCriteriaService;

    @PostMapping("/criteria")
    public ResponseEntity<CommonCommissionDto> inprogressSearchOtherCriteria(@RequestBody CommissionSearchDto commissionSearchDto, @RequestParam("role") String role){
        return inprogressSearchOtherCriteriaService.inprogressSearchOtherCriteria(commissionSearchDto, role);
    }

}