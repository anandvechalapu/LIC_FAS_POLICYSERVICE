package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionTemp;

public interface PolicyLevelConversionTempRepository extends JpaRepository<PolicyLevelConversionTemp, String> {

	PolicyLevelConversionTemp findByConversionId(String conversionId);

}

package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionTemp;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service.PolicyLevelConversionTempService;

@RestController
@RequestMapping("/plct")
public class PolicyLevelConversionTempController {

	@Autowired
	private PolicyLevelConversionTempService policyLevelConversionTempService;

	@GetMapping("/{conversionId}")
	public PolicyLevelConversionTemp getPolicyLevelConversionTempByConversionId(@PathVariable String conversionId) {
		return policyLevelConversionTempService.findByConversionId(conversionId);
	}

	@PostMapping
	public void savePolicyLevelConversionTemp(@RequestBody PolicyLevelConversionTemp policyLevelConversionTemp) {
		policyLevelConversionTempService.save(policyLevelConversionTemp);
	}

}