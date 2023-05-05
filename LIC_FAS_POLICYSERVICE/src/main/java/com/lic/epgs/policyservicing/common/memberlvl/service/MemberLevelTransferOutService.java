package com.lic.epgs.policyservicing.common.memberlvl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.repository.MemberLevelTransferOutRepository;

@Service
public class MemberLevelTransferOutService {

    @Autowired
    private MemberLevelTransferOutRepository memberLevelTransferOutRepository;

    /**
     * This service method is used to get the transfer-in and transfer-out details for the given policy and member
     * @param pageName pageName should be equal to transfer-search
     * @param policyId policyId should not be null
     * @param licId licId should not be null
     * @return TransferInAndOutResponseDto
     */
    public TransferInAndOutResponseDto getOverallDetailsService(String pageName, Integer policyId, Integer licId) {
        return memberLevelTransferOutRepository.getOverallDetails(pageName, policyId, licId);
    }

}