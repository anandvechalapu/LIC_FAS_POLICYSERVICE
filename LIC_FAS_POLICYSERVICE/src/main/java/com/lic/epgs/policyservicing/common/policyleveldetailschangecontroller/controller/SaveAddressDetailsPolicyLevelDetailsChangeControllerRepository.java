package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.dto.PolicyAddressOldDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.dto.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.SaveAddressDetailsPolicyLevelDetailsChangeControllerModel;

@Repository
public class SaveAddressDetailsPolicyLevelDetailsChangeControllerRepository {
	
	@Autowired
	private SaveAddressDetailsPolicyLevelDetailsChangeControllerModel saveAddressDetailsPolicyLevelDetailsChangeControllerModel;
	
	public PolicyDtlsResponseDto saveAddressDetails(PolicyAddressOldDto mphAddressNewDto) throws IllegalArgumentException {
		
		PolicyDtlsResponseDto responseDto = null;
		
		// Business logic to save address details
		
		saveAddressDetailsPolicyLevelDetailsChangeControllerModel = new SaveAddressDetailsPolicyLevelDetailsChangeControllerModel(mphAddressNewDto, responseDto);
		
		return responseDto;
	}
}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.dto.PolicyAddressOldDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.dto.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.SaveAddressDetailsPolicyLevelDetailsChangeControllerService;

@RestController
@RequestMapping("/policyservicing/common/policyleveldetailschangecontroller")
public class SaveAddressDetailsPolicyLevelDetailsChangeController {

	@Autowired
	private SaveAddressDetailsPolicyLevelDetailsChangeControllerService saveAddressDetailsPolicyLevelDetailsChangeControllerService;
	
	@PostMapping("/saveAddressDetails")
	public PolicyDtlsResponseDto saveAddressDetails(@RequestBody PolicyAddressOldDto mphAddressNewDto) throws IllegalArgumentException {
		return saveAddressDetailsPolicyLevelDetailsChangeControllerService.saveAddressDetails(mphAddressNewDto);
	}
}