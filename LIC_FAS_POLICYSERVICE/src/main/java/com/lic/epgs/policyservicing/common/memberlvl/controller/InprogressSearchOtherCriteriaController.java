package com.lic.epgs.policyservicing.common.memberlvl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommonCommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.InprogressSearchOtherCriteriaService;

@RestController
public class InprogressSearchOtherCriteriaController {
    
    @Autowired
    private InprogressSearchOtherCriteriaService service;
    
    @PostMapping("/inprogressSearchOtherCriteria")
    public CommonCommissionDto inprogressSearchOtherCriteria(@RequestBody CommissionSearchDto searchCriteria) {
        return service.inprogressSearchOtherCriteria(searchCriteria.getRole(), searchCriteria);
    }
    
}