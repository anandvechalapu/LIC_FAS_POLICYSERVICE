package com.lic.epgs.common.service;

import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.dto.MemberChangeDto;
import com.lic.epgs.common.dto.PolicyServiceProcessDto;
import com.lic.epgs.common.repository.PolicyServiceBulkTxnRepository;
import com.lic.epgs.common.utils.PolicyServicingObjectMappingUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceBulkTxnService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyServiceBulkTxnService.class);

    @Autowired
    private PolicyServiceBulkTxnRepository policyServiceBulkTxnRepository;

    public CommonResponseDto processMember(PolicyServiceProcessDto policyServiceProcessDto) throws ApplicationException {
        LOGGER.info("Start - processMember");

        //validate status request using the policyServicingObjectMappingUtils
        boolean isValidRequest = PolicyServicingObjectMappingUtils.validateStatusRequest(policyServiceProcessDto);
        if (isValidRequest) {
            //process member changes
            List<MemberChangeDto> memberChangeDtos = policyServiceBulkTxnRepository.processMemberEntity(policyServiceProcessDto);
            if (memberChangeDtos != null && !memberChangeDtos.isEmpty()) {
                //return success response
                return new CommonResponseDto(true, "Request processed for " + policyServiceProcessDto.getServiceType(), memberChangeDtos);
            } else {
                throw new ApplicationException("No valid requests to process for " + policyServiceProcessDto.getServiceType());
            }
        }
        LOGGER.info("End - processMember");
        return null;
    }

}