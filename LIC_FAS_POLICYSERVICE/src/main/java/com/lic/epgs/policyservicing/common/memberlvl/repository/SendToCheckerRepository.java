package com.lic.epgs.policyservicing.common.memberlvl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutResponseDto;

@Repository
public interface SendToCheckerRepository extends JpaRepository<TransferInAndOutResponseDto, Integer> {
    void sendToChecker(int transferId);
    boolean verifyTransferRequestExists(int transferId);
    boolean verifyTransferRequestStatus(int transferId, String status);
    void updateTransferStatus(int transferId, String status);
    void updateCorrespondingTransferOutStatus(int transferId, String status);
    String returnErrorMessage(int transferId);
    void logProcessStartAndEnd();
    TransferInAndOutResponseDto returnTransferInAndOutResponseDto(int transferId, String status, String message);
}