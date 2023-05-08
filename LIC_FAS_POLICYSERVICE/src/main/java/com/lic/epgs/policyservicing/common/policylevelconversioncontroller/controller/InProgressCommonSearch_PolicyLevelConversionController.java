package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.InProgressCommonSearch;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.InProgressCommonSearch_PolicyLevelConversionControllerService;

@RestController
@RequestMapping("/policylevelconversioncontroller")
public class InProgressCommonSearch_PolicyLevelConversionController {

	@Autowired
	private InProgressCommonSearch_PolicyLevelConversionControllerService service;
	
	@GetMapping("/search")
	public List<InProgressCommonSearch> search(@RequestParam String mphCode, @RequestParam String mphName, @RequestParam String status, @RequestParam String product, @RequestParam String unitCode, Pageable pageable){
		return service.findByMphCodeAndMphNameAndStatusAndProductAndUnitCodeOrderByModifiedOnDesc(mphCode, mphName, status, product, unitCode, pageable);
	}
	
}