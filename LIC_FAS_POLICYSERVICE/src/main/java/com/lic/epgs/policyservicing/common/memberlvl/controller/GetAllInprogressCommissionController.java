package com.lic.epgs.policyservicing.common.memberlvl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommonCommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionDetailsDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionNotesDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionQuestionDetailsDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.GetAllInprogressCommissionService;

@RestController
@RequestMapping("/common")
public class GetAllInprogressCommissionController {

    @Autowired
    private GetAllInprogressCommissionService getAllInprogressCommissionService;

    @GetMapping("/commission/{commissionId}")
    public CommonCommissionDto getAllInprogressCommission(@PathVariable String commissionId) {
        return getAllInprogressCommissionService.getAllInprogressCommission(commissionId);
    }

    @GetMapping("/commission/inprogress/{unitCode}")
    public List<CommonCommissionDto> getInProgressLoad(@PathVariable String unitCode) {
        return getAllInprogressCommissionService.getInProgressLoad(unitCode);
    }

    @GetMapping("/commission/details/{commissionId}")
    public CommissionDetailsDto getCommissionDetailsByCommissionId(@PathVariable String commissionId) {
        return getAllInprogressCommissionService.getCommissionDetailsByCommissionId(commissionId);
    }

    @GetMapping("/commission/details/temp/{tempCommissionId}")
    public CommissionDetailsDto getCommissionDetailsByTempCommissionId(@PathVariable String tempCommissionId) {
        return getAllInprogressCommissionService.getCommissionDetailsByTempCommissionId(tempCommissionId);
    }

    @GetMapping("/commission/questions/{commissionId}")
    public List<CommissionQuestionDetailsDto> getCommissionQuestionsByCommissionId(@PathVariable String commissionId) {
        return getAllInprogressCommissionService.getCommissionQuestionsByCommissionId(commissionId);
    }

    @GetMapping("/commission/notes/{commissionId}")
    public List<CommissionNotesDto> getCommissionNotesByCommissionId(@PathVariable String commissionId) {
        return getAllInprogressCommissionService.getCommissionNotesByCommissionId(commissionId);
    }
}