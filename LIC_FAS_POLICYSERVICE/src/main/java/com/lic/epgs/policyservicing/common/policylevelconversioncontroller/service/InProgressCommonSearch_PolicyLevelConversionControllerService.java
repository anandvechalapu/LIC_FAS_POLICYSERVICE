package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.InProgressCommonSearch;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.InProgressCommonSearch_PolicyLevelConversionControllerRepository;

@Service
public class InProgressCommonSearch_PolicyLevelConversionControllerService {
	
	@Autowired
	private InProgressCommonSearch_PolicyLevelConversionControllerRepository repo;
	
	public List<InProgressCommonSearch> findByMphCodeAndMphNameAndStatusAndProductAndUnitCodeOrderByModifiedOnDesc(String mphCode, String mphName, String status, String product, String unitCode){
		return repo.findByMphCodeAndMphNameAndStatusAndProductAndUnitCodeOrderByModifiedOnDesc(mphCode, mphName, status, product, unitCode);
	}
	
	public List<InProgressCommonSearch> findByMphCodeAndMphNameAndStatusAndProductAndUnitCode(String mphCode, String mphName, String status, String product, String unitCode, Pageable pageable){
		return repo.findByMphCodeAndMphNameAndStatusAndProductAndUnitCode(mphCode, mphName, status, product, unitCode, pageable);
	}
	
	public List<InProgressCommonSearch> findByMphCodeAndMphNameAndStatusAndProductAndUnitCodeOrderByModifiedOnDesc(String mphCode, String mphName, String status, String product, String unitCode, Pageable pageable){
		return repo.findByMphCodeAndMphNameAndStatusAndProductAndUnitCodeOrderByModifiedOnDesc(mphCode, mphName, status, product, unitCode, pageable);
	}

}