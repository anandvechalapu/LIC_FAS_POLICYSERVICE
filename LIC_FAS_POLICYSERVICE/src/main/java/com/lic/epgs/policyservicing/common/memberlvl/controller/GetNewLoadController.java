package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.dto.MemberMasterDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.GetNewLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/policyservicing/common/memberlvl")
public class GetNewLoadController {

    @Autowired
    private GetNewLoadService getNewLoadService;

    @GetMapping("/{policyId}")
    public List<MemberMasterDto> getNewLoad(@PathVariable Long policyId) {
        return getNewLoadService.getNewLoad(policyId);
    }

    @GetMapping("/response/{policyId}")
    public TransferInAndOutResponseDto getNewLoadResponse(@PathVariable Long policyId) {
        return getNewLoadService.getNewLoadResponse(policyId);
    }
}