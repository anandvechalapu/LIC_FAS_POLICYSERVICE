//Spring Boot Service Class

package com.lic.epgs.policyservicing.common.memberlvl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.repository.CommissionRepository;

@Service
public class CommissionService {

    @Autowired
    CommissionRepository commissionRepository;

    public List<CommissionEntity> getInprogressLoad(String role, String unitCode) {
        return commissionRepository.getInprogressLoad(role, unitCode);
    }

    public List<CommissionEntity> getInprogressMakerLoad(String role, String unitCode) {
        return commissionRepository.getInprogressMakerLoad(role, unitCode);
    }

    public Optional<CommissionEntity> findById(Long id) {
        return commissionRepository.findById(id);
    }

    public CommissionEntity save(CommissionEntity commissionEntity) {
        return commissionRepository.save(commissionEntity);
    }

    public void delete(CommissionEntity commissionEntity) {
        commissionRepository.delete(commissionEntity);
    }

    public CommissionDetailsEntity saveCommissionDetails(CommissionDetailsEntity commissionDetailsEntity) {
        return commissionRepository.saveCommissionDetails(commissionDetailsEntity);
    }

    public void deleteCommissionDetails(CommissionDetailsEntity commissionDetailsEntity) {
        commissionRepository.deleteCommissionDetails(commissionDetailsEntity);
    }

}