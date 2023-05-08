package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesOldDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.PolicyRulesTempRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyRulesTempService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyRulesTempService.class);

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PolicyRulesTempRepository policyRulesTempRepository;

    /**
     * This method is used to retrieve the list of policy rules for a given policy ID
     *
     * @param policyId the policy ID to look up
     * @return a PolicyDtlsResponseDto containing a list of PolicyRulesOldDto objects mapped from the PolicyRulesTempEntity objects
     * @throws IllegalArgumentException if the policy ID is invalid
     */
    public PolicyDtlsResponseDto getRulesList(Long policyId) throws IllegalArgumentException {
        LOGGER.info("Retrieving policy rules for policy ID: {}", policyId);
        List<PolicyRulesTempEntity> policyRulesTempEntityList = policyRulesTempRepository.findByPolicyId(policyId);
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

}