package com.lic.epgs.topupda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.topupda.entity.Topupda;
import com.lic.epgs.topupda.repository.ExistingCitrieaLoad_topupdaRepository;

@Service
public class ExistingCitrieaLoad_topupdaService {

	@Autowired
	private ExistingCitrieaLoad_topupdaRepository existingCitrieaLoad_topupdaRepository;

	public List<Topupda> getExistingCriteriaLoadTopupdaData() {
		return existingCitrieaLoad_topupdaRepository.getExistingCriteriaLoadTopupdaData();
	}

	public List<Topupda> getExistingCriteriaLoadTopupdaDataBasedOnUnitCodeAndQuotationNumber(String unitCode,
			String quotationNumber) {
		return existingCitrieaLoad_topupdaRepository
				.getExistingCriteriaLoadTopupdaDataBasedOnUnitCodeAndQuotationNumber(unitCode, quotationNumber);
	}

}