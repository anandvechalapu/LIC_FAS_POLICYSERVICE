package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommonCommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;
import com.lic.epgs.policyservicing.common.memberlvl.repository.InprogressSearchOtherCriteriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InprogressSearchOtherCriteriaService {
    
    @Autowired
    private InprogressSearchOtherCriteriaRepository repository;
    
    public CommonCommissionDto inprogressSearchOtherCriteria(String role, CommissionSearchDto searchCriteria) {
        return repository.inprogressSearchOtherCriteria(role, searchCriteria);
    }
    
}