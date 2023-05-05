package com.lic.epgs.policyservicing.common.memberlvl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.SendToCheckerService;

@RestController
@RequestMapping("/memberlvl/sendToChecker")
public class SendToCheckerController {
    
    @Autowired
    private SendToCheckerService sendToCheckerService;

    @PostMapping
    public ResponseEntity<TransferInAndOutResponseDto> sendToChecker(@RequestBody int transferId) {
        TransferInAndOutResponseDto response = sendToCheckerService.sendToChecker(transferId);
        return ResponseEntity.ok(response);
    }
}