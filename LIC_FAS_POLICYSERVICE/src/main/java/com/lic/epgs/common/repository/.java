package com.lic.epgs.common.repository;

import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.dto.MemberChangeDto;
import com.lic.epgs.common.dto.PolicyServiceProcessDto;
import com.lic.epgs.common.utils.PolicyServicingObjectMappingUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolicyServiceBulkTxnRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyServiceBulkTxnRepository.class);

    public CommonResponseDto processMember(PolicyServiceProcessDto policyServiceProcessDto) throws ApplicationException {
        LOGGER.info("Start - processMember");

        //validate status request using the policyServicingObjectMappingUtils
        boolean isValidRequest = PolicyServicingObjectMappingUtils.validateStatusRequest(policyServiceProcessDto);
        if (isValidRequest) {
            //process member changes
            List<MemberChangeDto> memberChangeDtos = processMemberEntity(policyServiceProcessDto);
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

    /**
     * Method to process member entity
     * @param policyServiceProcessDto
     * @return list of MemberChangeDto objects
     */
    private List<MemberChangeDto> processMemberEntity(PolicyServiceProcessDto policyServiceProcessDto) {
        //retrieve necessary data from the database and generate the MemberChangeDto objects
        return null;
    }
}