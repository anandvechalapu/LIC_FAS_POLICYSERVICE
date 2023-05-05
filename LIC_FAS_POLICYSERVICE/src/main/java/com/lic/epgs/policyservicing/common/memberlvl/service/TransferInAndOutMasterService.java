package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.entity.TransferInAndOutMasterEntity;
import com.lic.epgs.policyservicing.common.memberlvl.repository.TransferInAndOutMasterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferInAndOutMasterService {
    
    @Autowired
    private TransferInAndOutMasterRepository transferInAndOutMasterRepository;

    public TransferInAndOutMasterEntity getTransferInAndOutMaster(String unitCode, String transferId) {
        return transferInAndOutMasterRepository.findByUnitCodeAndTransferId(unitCode, transferId);
    }
    
}