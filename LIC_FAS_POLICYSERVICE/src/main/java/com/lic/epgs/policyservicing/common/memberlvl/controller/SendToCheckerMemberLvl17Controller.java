package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.SendToCheckerMemberLvl17Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendToCheckerMemberLvl17Controller {

    @Autowired
    private SendToCheckerMemberLvl17Service sendToCheckerMemberLvl17Service;

    @GetMapping("/findByTransferIdAndStatus")
    public TransferInAndOutResponseDto findByTransferIdAndStatus(@RequestParam("transferId") long transferId, @RequestParam("status") String status) {
        return sendToCheckerMemberLvl17Service.findByTransferIdAndStatus(transferId, status);
    }

    @PostMapping("/save")
    public TransferInAndOutResponseDto save(@RequestBody TransferInAndOutResponseDto transferInAndOutResponseDto) {
        return sendToCheckerMemberLvl17Service.save(transferInAndOutResponseDto);
    }

    @PostMapping("/logStartAndEndOfProcess")
    public void logStartAndEndOfProcess() {
        sendToCheckerMemberLvl17Service.logStartAndEndOfProcess();
    }

    @PostMapping("/updateStatusForTransferOut")
    public void updateStatusForTransferOut(@RequestParam("transferId") long transferId, @RequestParam("status") String status) {
        sendToCheckerMemberLvl17Service.updateStatusForTransferOut(transferId, status);
    }

    @PostMapping("/updateStatusForTransferIn")
    public void updateStatusForTransferIn(@RequestParam("transferId") long transferId, @RequestParam("status") String status) {
        sendToCheckerMemberLvl17Service.updateStatusForTransferIn(transferId, status);
    }
}