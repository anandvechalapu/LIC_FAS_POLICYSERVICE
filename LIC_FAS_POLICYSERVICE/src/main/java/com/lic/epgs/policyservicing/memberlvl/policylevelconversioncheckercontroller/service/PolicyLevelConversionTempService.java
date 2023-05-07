package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionTemp;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.repository.PolicyLevelConversionTempRepository;

@Service
public class PolicyLevelConversionTempService {

	@Autowired
	private PolicyLevelConversionTempRepository policyLevelConversionTempRepository;

	public PolicyLevelConversionTemp findByConversionId(String conversionId) {
		return policyLevelConversionTempRepository.findByConversionId(conversionId);
	}

	public void save(PolicyLevelConversionTemp policyLevelConversionTemp) {
		policyLevelConversionTempRepository.save(policyLevelConversionTemp);
	}

}