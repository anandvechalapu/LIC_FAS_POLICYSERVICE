package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommonCommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionDetailsDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionNotesDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionQuestionDetailsDto;
import com.lic.epgs.policyservicing.common.memberlvl.repository.GetAllInprogressCommissionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllInprogressCommissionService {
    
    @Autowired
    private GetAllInprogressCommissionRepository getAllInprogressCommissionRepository;
    
    public CommonCommissionDto getAllInprogressCommission(String commissionId) {
        return getAllInprogressCommissionRepository.getAllInprogressCommission(commissionId);
    }
    
    public List<CommonCommissionDto> getInProgressLoad(String unitCode) {
        return getAllInprogressCommissionRepository.getInProgressLoad(unitCode);
    }
    
    public CommissionDetailsDto getCommissionDetailsByCommissionId(String commissionId) {
        return getAllInprogressCommissionRepository.getCommissionDetailsByCommissionId(commissionId);
    }
    
    public CommissionDetailsDto getCommissionDetailsByTempCommissionId(String tempCommissionId) {
        return getAllInprogressCommissionRepository.getCommissionDetailsByTempCommissionId(tempCommissionId);
    }
    
    public List<CommissionQuestionDetailsDto> getCommissionQuestionsByCommissionId(String commissionId) {
        return getAllInprogressCommissionRepository.getCommissionQuestionsByCommissionId(commissionId);
    }
    
    public List<CommissionNotesDto> getCommissionNotesByCommissionId(String commissionId) {
        return getAllInprogressCommissionRepository.getCommissionNotesByCommissionId(commissionId);
    }
}