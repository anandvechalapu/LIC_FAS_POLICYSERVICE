package com.lic.epgs.policyservicing.common.memberlvl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;
import com.lic.epgs.policyservicing.common.memberlvl.repository.CommissionRepository;

@Service
public class CommissionService {
	
	@Autowired
	private CommissionRepository commissionRepository;
	
	public CommissionEntity getInprogressLoad(String role, String unitCode) {
		return commissionRepository.getInprogressLoad(role, unitCode);
	}
	
	public CommissionDetailsEntity getInprogressMakerLoad(String role, String unitCode) {
		return commissionRepository.getInprogressMakerLoad(role, unitCode);
	}
	
	public List<CommissionEntity> getAllCommissions() {
		return commissionRepository.findAll();
	}
	
	public CommissionEntity saveCommission(CommissionEntity commission) {
		return commissionRepository.save(commission);
	}
	
	public CommissionDetailsEntity saveCommissionDetails(CommissionDetailsEntity commissionDetails) {
		return commissionRepository.save(commissionDetails);
	}

}