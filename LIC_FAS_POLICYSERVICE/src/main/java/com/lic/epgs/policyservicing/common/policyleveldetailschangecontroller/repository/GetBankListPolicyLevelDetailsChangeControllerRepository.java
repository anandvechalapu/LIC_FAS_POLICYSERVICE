package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.MphBankDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyBankOldDto;

public interface GetBankListPolicyLevelDetailsChangeControllerRepository extends JpaRepository<MphBankDto, Long> {
	
	@Query("SELECT mb FROM MphBankDto mb WHERE mb.mphId = ?1")
	public PolicyBankOldDto convertNewDtoToOld(Long mphId);
	
	@Query("SELECT mb FROM MphBankDto mb WHERE mb.mphId = ?1")
	public List<MphBankDto> getBankList(Long mphId);

}