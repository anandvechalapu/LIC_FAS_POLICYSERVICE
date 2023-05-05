package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.model.Commission;
import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionNotes;
import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionQuestionDetails;
import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionTemp;
import com.lic.epgs.policyservicing.common.memberlvl.repository.CheckerRejectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckerRejectService {

    @Autowired
    private CheckerRejectRepository checkerRejectRepository;

    public void rejectCommission(CommissionDto commissionDto, Long commissionId, String role) {
        checkerRejectRepository.rejectCommission(commissionDto, commissionId, role);
    }

    public CommissionTemp getCommissionTempByCommissionId(Long commissionId) {
        return checkerRejectRepository.getCommissionTempByCommissionId(commissionId);
    }

    public void saveRejectedCommissionToCommissionTable(Commission commission) {
        checkerRejectRepository.saveRejectedCommissionToCommissionTable(commission);
    }

    public List<CommissionQuestionDetails> getCommissionQuestionDetailsByCommissionId(Long commissionId) {
        return checkerRejectRepository.getCommissionQuestionDetailsByCommissionId(commissionId);
    }

    public List<CommissionNotes> getCommissionNotesByCommissionId(Long commissionId) {
        return checkerRejectRepository.getCommissionNotesByCommissionId(commissionId);
    }

}