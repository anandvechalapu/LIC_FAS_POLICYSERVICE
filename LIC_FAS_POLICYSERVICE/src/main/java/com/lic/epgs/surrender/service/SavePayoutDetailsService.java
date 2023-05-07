package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.dto.PolicySurrenderPayOutDto;
import com.lic.epgs.surrender.entity.PolicySurrenderPayOutTempEntity;
import com.lic.epgs.surrender.repository.SavePayoutDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavePayoutDetailsService {

    @Autowired
    private SavePayoutDetailsRepository savePayoutDetailsRepository;

    public PolicySurrenderPayOutTempEntity save(PolicySurrenderPayOutDto policySurrenderPayOutDto) {
        return savePayoutDetailsRepository.save(policySurrenderPayOutDto);
    }

    public List<PolicySurrenderPayOutTempEntity> findAllByIsActive(boolean isActive) {
        return savePayoutDetailsRepository.findAllByIsActive(isActive);
    }

    public PolicySurrenderPayOutTempEntity findByCreatedByAndModifiedBy(String createdBy, String modifiedBy) {
        return savePayoutDetailsRepository.findByCreatedByAndModifiedBy(createdBy, modifiedBy);
    }

    public void deleteById(Long id) {
        savePayoutDetailsRepository.deleteById(id);
    }

    public void deleteByCreatedByAndModifiedBy(String createdBy, String modifiedBy) {
        savePayoutDetailsRepository.deleteByCreatedByAndModifiedBy(createdBy, modifiedBy);
    }

    public void deleteByIsActive(boolean isActive) {
        savePayoutDetailsRepository.deleteByIsActive(isActive);
    }

}