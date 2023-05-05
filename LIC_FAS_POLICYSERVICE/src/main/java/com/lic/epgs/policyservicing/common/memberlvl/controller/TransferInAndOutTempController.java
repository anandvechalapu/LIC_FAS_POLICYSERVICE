package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutReqDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.TransferInAndOutTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferInAndOutTempController {

    @Autowired
    private TransferInAndOutTempService transferInAndOutTempService;

    @PostMapping("/sendToMaker")
    public TransferInAndOutResponseDto sendToMaker(@RequestBody TransferInAndOutReqDto transferReqDto) {
    	return transferInAndOutTempService.sendToMaker(transferReqDto);
    }
}