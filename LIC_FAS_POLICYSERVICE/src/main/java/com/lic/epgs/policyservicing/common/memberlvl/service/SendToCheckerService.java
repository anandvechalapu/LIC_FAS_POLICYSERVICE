package com.lic.epgs.policyservicing.common.memberlvl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.repository.SendToCheckerRepository;

@Service
public class SendToCheckerService {
    
    @Autowired
    private SendToCheckerRepository sendToCheckerRepository;

    @Transactional
    public void sendToChecker(int transferId) {
        sendToCheckerRepository.sendToChecker(transferId);
    }

    public boolean verifyTransferRequestExists(int transferId) {
        return sendToCheckerRepository.verifyTransferRequestExists(transferId);
    }

    public boolean verifyTransferRequestStatus(int transferId, String status) {
        return sendToCheckerRepository.verifyTransferRequestStatus(transferId, status);
    }

    public void updateTransferStatus(int transferId, String status) {
        sendToCheckerRepository.updateTransferStatus(transferId, status);
    }

    public void updateCorrespondingTransferOutStatus(int transferId, String status) {
        sendToCheckerRepository.updateCorrespondingTransferOutStatus(transferId, status);
    }

    public String returnErrorMessage(int transferId) {
        return sendToCheckerRepository.returnErrorMessage(transferId);
    }

    public void logProcessStartAndEnd() {
        sendToCheckerRepository.logProcessStartAndEnd();
    }

    public TransferInAndOutResponseDto returnTransferInAndOutResponseDto(int transferId, String status, String message) {
        return sendToCheckerRepository.returnTransferInAndOutResponseDto(transferId, status, message);
    }
}