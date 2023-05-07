package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyLevelConversion;

public interface PolicyLevelConversionRepository extends JpaRepository<PolicyLevelConversion, String> {

}

package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service.PolicyLevelConversionService;

@RestController
@RequestMapping("/policyLevelConversion")
public class PolicyLevelConversionController {

	@Autowired
	private PolicyLevelConversionService policyLevelConversionService;
	
	@PostMapping
	public CommonResponseDto savePolicyConversionDetails(@RequestBody PolicyLevelConversionDto policyLevelConversionDTO) {
		return policyLevelConversionService.savePolicyConversionDetails(policyLevelConversionDTO);
	}
	
}