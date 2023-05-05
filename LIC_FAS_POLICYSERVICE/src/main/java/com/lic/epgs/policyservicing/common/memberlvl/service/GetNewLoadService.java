package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.dto.MemberMasterDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.repository.GetNewLoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetNewLoadService {

    @Autowired
    private GetNewLoadRepository getNewLoadRepository;

    public List<MemberMasterDto> getNewLoad(Long policyId) {
        return getNewLoadRepository.getNewLoad(policyId);
    }

    public TransferInAndOutResponseDto getNewLoadResponse(Long policyId) {
        return getNewLoadRepository.getNewLoadResponse(policyId);
    }
}