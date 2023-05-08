package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationSearchDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.InprogressCitrieaSearch_PolicyLevelFreeLookCancelControllerRepository;

@Service
public class InprogressCitrieaSearch_PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private InprogressCitrieaSearch_PolicyLevelFreeLookCancelControllerRepository repository;

    // Method to search for in-progress free-look cancellation policies
    public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPolicies(FreeLookCancellationSearchDto searchDto){
        return repository.searchInProgressFreeLookCancellationPolicies(searchDto.getRole(), searchDto.getPolicyNumber(), searchDto.getMphCode(),
                searchDto.getMphName(), searchDto.getFromDate(), searchDto.getToDate(), searchDto.getProduct(),
                searchDto.getLob(), searchDto.getFreeLookStatus(), searchDto.getUnitCode());
    }

    // Method to search for in-progress free-look cancellation policies based on maker role
    public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPoliciesByMakerRole(FreeLookCancellationSearchDto searchDto){
        return repository.searchInProgressFreeLookCancellationPoliciesByMakerRole(searchDto.getRole(), searchDto.getFromDate(), searchDto.getToDate());
    }

    // Method to search for in-progress free-look cancellation policies based on checker role
    public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPoliciesByCheckerRole(FreeLookCancellationSearchDto searchDto){
        return repository.searchInProgressFreeLookCancellationPoliciesByCheckerRole(searchDto.getRole(), searchDto.getFromDate(), searchDto.getToDate());
    }
}