package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.repository.CommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public List<CommissionEntity> getInprogressLoad(String unitCode) {
        return commissionRepository.getInprogressLoad(unitCode);
    }

    public List<CommissionEntity> getInprogressMakerLoad(String unitCode) {
        return commissionRepository.getInprogressMakerLoad(unitCode);
    }

}