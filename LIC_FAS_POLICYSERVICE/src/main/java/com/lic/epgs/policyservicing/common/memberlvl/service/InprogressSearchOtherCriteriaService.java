package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommonCommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;
import com.lic.epgs.policyservicing.common.memberlvl.repository.InprogressSearchOtherCriteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InprogressSearchOtherCriteriaService {

    @Autowired
    private InprogressSearchOtherCriteriaRepository inprogressSearchOtherCriteriaRepository;

    public ResponseEntity<CommonCommissionDto> inprogressSearchOtherCriteria(CommissionSearchDto commissionSearchDto, String role){
        return inprogressSearchOtherCriteriaRepository.inprogressSearchOtherCriteria(commissionSearchDto, role);
    }
}