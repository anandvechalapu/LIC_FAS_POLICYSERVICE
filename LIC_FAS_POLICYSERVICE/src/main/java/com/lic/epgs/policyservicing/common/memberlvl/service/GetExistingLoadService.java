package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.entity.TransferInAndOutMasterEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.TransferInAndOutTempEntity;
import com.lic.epgs.policyservicing.common.memberlvl.repository.GetExistingLoadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetExistingLoadService {

    private final GetExistingLoadRepository getExistingLoadRepository;

    @Autowired
    public GetExistingLoadService(GetExistingLoadRepository getExistingLoadRepository) {
        this.getExistingLoadRepository = getExistingLoadRepository;
    }

    public TransferInAndOutResponseDto getExistingLoad(String role, String unitCode) {
        return getExistingLoadRepository.getExistingLoad(role, unitCode);
    }

    public boolean isExistingLoadExists(String role, String unitCode) {
        return getExistingLoadRepository.isExistingLoadExists(role, unitCode);
    }

    public List<TransferInAndOutMasterEntity> getMasterEntities(String role, String unitCode) {
        return getExistingLoadRepository.getMasterEntities(role, unitCode);
    }

    public List<TransferInAndOutTempEntity> getTempEntities(String role, String unitCode) {
        return getExistingLoadRepository.getTempEntities(role, unitCode);
    }

}