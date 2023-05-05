package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.repository.SendToCheckerMemberLvl17Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendToCheckerMemberLvl17Service {

    @Autowired
    private SendToCheckerMemberLvl17Repository sendToCheckerMemberLvl17Repository;

    public TransferInAndOutResponseDto findByTransferIdAndStatus(long transferId, String status) {
        return sendToCheckerMemberLvl17Repository.findByTransferIdAndStatus(transferId, status);
    }

    public TransferInAndOutResponseDto save(TransferInAndOutResponseDto transferInAndOutResponseDto) {
        return sendToCheckerMemberLvl17Repository.save(transferInAndOutResponseDto);
    }

    public void logStartAndEndOfProcess() {
        sendToCheckerMemberLvl17Repository.logStartAndEndOfProcess();
    }

    public void updateStatusForTransferOut(long transferId, String status) {
        sendToCheckerMemberLvl17Repository.updateStatusForTransferOut(transferId, status);
    }

    public void updateStatusForTransferIn(long transferId, String status) {
        sendToCheckerMemberLvl17Repository.updateStatusForTransferIn(transferId, status);
    }

}