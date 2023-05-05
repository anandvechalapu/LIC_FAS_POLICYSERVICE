package com.lic.epgs.policyservicing.common.memberlvl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;

@Repository
public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {

    public CommissionEntity findByUnitCodeAndRole(String unitCode, String role);
    
    public CommissionDetailsEntity findByCommissionId(Long commissionId);
    
    public void deleteByCommissionId(Long commissionId);
    
    public CommissionEntity save(CommissionEntity commissionEntity);
    
    public CommissionDetailsEntity save(CommissionDetailsEntity commissionDetailsEntity);
    
}