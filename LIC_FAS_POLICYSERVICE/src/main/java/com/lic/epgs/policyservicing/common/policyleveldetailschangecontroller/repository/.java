package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyDtlsChangeTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.PolicyDetailsChangeService;

@Repository
public class PolicyLevelDetailsChangeControllerRepository {
	
	private static final Logger logger = LoggerFactory.getLogger(PolicyLevelDetailsChangeControllerRepository.class);
	
	@Autowired
	private PolicyDetailsChangeService policyDetailsChangeService;
	
	public PolicyDtlsResponseDto sendToMaker(Long policyDtlsId) {
		logger.info("sendToMaker method started with policyDtlsId {}", policyDtlsId);
		
		Optional<PolicyDtlsChangeTempEntity> policyDtlsChangeTempEntity = policyDetailsChangeService.findById(policyDtlsId);
		if(policyDtlsChangeTempEntity.isPresent()) {
			policyDtlsChangeTempEntity.get().setStatus("CHECKER_NO");
			policyDtlsChangeTempEntity.get().setModifiedOn(new Date());
			
			PolicyDtlsChangeTempEntity updatedPolicyDtlsChangeTempEntity = policyDetailsChangeService.save(policyDtlsChangeTempEntity.get());
			
			PolicyDtlsResponseDto response = new PolicyDtlsResponseDto();
			response.setPolicyDtlsChangeTempEntity(updatedPolicyDtlsChangeTempEntity);
			response.setStatus("SUCCESS");
			response.setMessage("UPDATEMESSAGE");
			
			logger.info("sendToMaker method completed successfully");
			
			return response;
		} else {
			PolicyDtlsResponseDto response = new PolicyDtlsResponseDto();
			response.setStatus("FAIL");
			response.setMessage("ERROR");
			
			logger.info("sendToMaker method completed with failure");
			
			return response;
		}
		
	}

}