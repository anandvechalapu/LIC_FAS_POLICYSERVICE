package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.MphBankDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyBankOldDto;

@Repository
public interface GetBankListPolicyLevelDetailsChangeControllerRepository extends JpaRepository<MphBankDto, Long> {

    @Query("SELECT new com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyBankOldDto(mph.mphName, mph.mphType, mph.mphCode) FROM MphBankDto mph WHERE mph.mphId = ?1")
    PolicyBankOldDto convertNewDtoToOld(Long mphId);
    
    List<MphBankDto> getBankList(Long mphId);
    
}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.MphBankDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyBankOldDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.GetBankListPolicyLevelDetailsChangeControllerService;

@RestController
@RequestMapping("/bank")
public class GetBankListPolicyLevelDetailsChangeController {
	
	@Autowired
	GetBankListPolicyLevelDetailsChangeControllerService getBankListPolicyLevelDetailsChangeControllerService;
	
	@GetMapping("/{mphId}")
	public List<MphBankDto> getBankList(@PathVariable("mphId") Long mphId) {
		return getBankListPolicyLevelDetailsChangeControllerService.getBankList(mphId);
	}
	
	@GetMapping("/old/{mphId}")
	public PolicyBankOldDto convertNewDtoToOld(@PathVariable("mphId") Long mphId) {
		return getBankListPolicyLevelDetailsChangeControllerService.convertNewDtoToOld(mphId);
	}
	
}