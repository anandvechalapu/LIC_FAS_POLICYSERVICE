package com.lic.epgs.policyservicing.common.memberlvl.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionSearchPage;
import com.lic.epgs.policyservicing.common.memberlvl.repository.LoadExistingCommissionSearchPageRepository;

@Service
public class LoadExistingCommissionSearchPageService {

	@Autowired
	private LoadExistingCommissionSearchPageRepository loadExistingCommissionSearchPageRepository;
	
	public Optional<CommissionSearchPage> findByUnitCode(String unitCode) {
		return loadExistingCommissionSearchPageRepository.findByUnitCode(unitCode);
	}
	
}