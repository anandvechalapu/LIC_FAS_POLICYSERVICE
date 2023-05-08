package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesOldDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesTempEntity;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolicyRulesTempRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyRulesTempRepository.class);

    @Autowired
    private ModelMapper modelMapper;

    /**
     * This method is used to retrieve the list of policy rules for a given policy ID
     *
     * @param policyId the policy ID to look up
     * @return a PolicyDtlsResponseDto containing a list of PolicyRulesOldDto objects mapped from the PolicyRulesTempEntity objects
     * @throws IllegalArgumentException if the policy ID is invalid
     */
    public PolicyDtlsResponseDto getRulesList(Long policyId) throws IllegalArgumentException {
        LOGGER.info("Retrieving policy rules for policy ID: {}", policyId);
        List<PolicyRulesTempEntity> policyRulesTempEntityList = findByPolicyId(policyId);
        PolicyDtlsResponseDto policyDtlsResponseDto;
        if (policyRulesTempEntityList.size() > 0) {
            List<PolicyRulesOldDto> policyRulesOldDtoList = modelMapper.map(policyRulesTempEntityList, List.class);
            policyDtlsResponseDto = new PolicyDtlsResponseDto();
            policyDtlsResponseDto.setTransactionStatus("SUCCESS");
            policyDtlsResponseDto.setPolicyRulesOldDtoList(policyRulesOldDtoList);
        } else {
            policyDtlsResponseDto = new PolicyDtlsResponseDto();
            policyDtlsResponseDto.setTransactionStatus("ERROR");
            policyDtlsResponseDto.setTransactionMessage("DENY");
        }
        LOGGER.info("Finished retrieving policy rules for policy ID: {}", policyId);
        return policyDtlsResponseDto;
    }

    /**
     * This method is used to retrieve the list of PolicyRulesTempEntity objects associated with a given policy ID
     *
     * @param policyId the policy ID to look up
     * @return a list of PolicyRulesTempEntity objects associated with the given policy ID
     * @throws IllegalArgumentException if the policy ID is invalid
     */
    private List<PolicyRulesTempEntity> findByPolicyId(Long policyId) throws IllegalArgumentException {
        //TODO:
        // Implement the findByPolicyId(Long policyId) method
    }

}