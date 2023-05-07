package com.lic.epgs.surrender.service;

import org.springframework.stereotype.Service;

import com.lic.epgs.surrender.model.CommonResponseDto;
import com.lic.epgs.surrender.repository.InProgressCriteriaSearch_PolicySurrenderRepository;

@Service
public class InProgressCriteriaSearch_PolicySurrenderService {

	private InProgressCriteriaSearch_PolicySurrenderRepository search_PolicySurrenderRepository;
	
	public InProgressCriteriaSearch_PolicySurrenderService(InProgressCriteriaSearch_PolicySurrenderRepository search_PolicySurrenderRepository) {
		this.search_PolicySurrenderRepository = search_PolicySurrenderRepository;
	}

	public CommonResponseDto searchInProgressPolicySurrenders(String policyNo, String mphCode, String mphName, String surrenderStatus, String product, String unitCode, String role, String fromDate, String toDate, Integer pageCount, Integer limit) {
		return search_PolicySurrenderRepository.searchInProgressPolicySurrenders(policyNo, mphCode, mphName, surrenderStatus, product, unitCode, role, fromDate, toDate, pageCount, limit);
	}
}