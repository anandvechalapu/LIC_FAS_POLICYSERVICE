package com.lic.epgs.policyservicing.common.memberlvl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;
import com.lic.epgs.policyservicing.common.memberlvl.repository.CommissionRepository;

@Service
@Transactional
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public CommissionEntity findByUnitCodeAndRole(String unitCode, String role) {
        return commissionRepository.findByUnitCodeAndRole(unitCode, role);
    }
    
    public CommissionDetailsEntity findByCommissionId(Long commissionId) {
        return commissionRepository.findByCommissionId(commissionId);
    }
    
    public void deleteByCommissionId(Long commissionId) {
        commissionRepository.deleteByCommissionId(commissionId);
    }
    
    public CommissionEntity save(CommissionEntity commissionEntity) {
        return commissionRepository.save(commissionEntity);
    }
    
    public CommissionDetailsEntity save(CommissionDetailsEntity commissionDetailsEntity) {
        return commissionRepository.save(commissionDetailsEntity);
    }
    
    public List<CommissionEntity> findAllCommissions() {
        return commissionRepository.findAll();
    }
    
}