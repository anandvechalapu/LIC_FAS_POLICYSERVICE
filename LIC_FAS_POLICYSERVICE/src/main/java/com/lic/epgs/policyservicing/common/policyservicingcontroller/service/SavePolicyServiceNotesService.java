package com.lic.epgs.policyservicing.common.policyservicingcontroller.service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.SavePolicyServiceNotesRepository;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceNotesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavePolicyServiceNotesService {

    @Autowired
    private SavePolicyServiceNotesRepository savePolicyServiceNotesRepository;

    public CommonResponseDto savePolicyServiceNotes(String serviceId, String policyId, String serviceType, String role, int page, String note) {
        CommonResponseDto commonResponseDto = new CommonResponseDto();
        PolicyServiceNotesDto policyServiceNotesDto = new PolicyServiceNotesDto();
        policyServiceNotesDto.setServiceId(serviceId);
        policyServiceNotesDto.setPolicyId(policyId);
        policyServiceNotesDto.setServiceType(serviceType);
        policyServiceNotesDto.setRole(role);
        policyServiceNotesDto.setPage(page);
        policyServiceNotesDto.setNote(note);

        commonResponseDto = savePolicyServiceNotesRepository.savePolicyServiceNotes(policyServiceNotesDto);
        return commonResponseDto;
    }
}