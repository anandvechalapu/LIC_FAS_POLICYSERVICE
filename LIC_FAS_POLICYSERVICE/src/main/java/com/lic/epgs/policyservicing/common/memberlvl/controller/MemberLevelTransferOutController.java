package com.lic.epgs.policyservicing.common.memberlvl.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.MemberLevelTransferOutService;
 
@RestController
@RequestMapping("/memberLevelTransferOut")
public class MemberLevelTransferOutController {
 
    @Autowired
    private MemberLevelTransferOutService memberLevelTransferOutService;
 
    @GetMapping("/overallDetails")
    public TransferInAndOutResponseDto getOverallDetails(@RequestParam("pageName") String pageName,
                                                        @RequestParam("policyId") Integer policyId,
                                                        @RequestParam("licId") Integer licId) {
        return memberLevelTransferOutService.getOverallDetailsService(pageName, policyId, licId);
    }
}