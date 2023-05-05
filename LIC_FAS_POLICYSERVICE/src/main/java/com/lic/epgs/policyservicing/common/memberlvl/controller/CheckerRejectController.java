package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.model.Commission;
import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionNotes;
import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionQuestionDetails;
import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionTemp;
import com.lic.epgs.policyservicing.common.memberlvl.service.CheckerRejectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/memberlvl/checkerReject")
public class CheckerRejectController {

    @Autowired
    private CheckerRejectService checkerRejectService;

    @PostMapping
    public void rejectCommission(@RequestBody CommissionDto commissionDto, Long commissionId, String role) {
        checkerRejectService.rejectCommission(commissionDto, commissionId, role);
    }

    @PostMapping("/getCommissionTempByCommissionId")
    public CommissionTemp getCommissionTempByCommissionId(Long commissionId) {
        return checkerRejectService.getCommissionTempByCommissionId(commissionId);
    }

    @PostMapping("/saveRejectedCommissionToCommissionTable")
    public void saveRejectedCommissionToCommissionTable(Commission commission) {
        checkerRejectService.saveRejectedCommissionToCommissionTable(commission);
    }

    @PostMapping("/getCommissionQuestionDetailsByCommissionId")
    public List<CommissionQuestionDetails> getCommissionQuestionDetailsByCommissionId(Long commissionId) {
        return checkerRejectService.getCommissionQuestionDetailsByCommissionId(commissionId);
    }

    @PostMapping("/getCommissionNotesByCommissionId")
    public List<CommissionNotes> getCommissionNotesByCommissionId(Long commissionId) {
        return checkerRejectService.getCommissionNotesByCommissionId(commissionId);
    }

}