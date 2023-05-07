package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.model.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.repository.GetExistingSurrenderOverallDetails_PolicySurrenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetExistingSurrenderOverallDetails_PolicySurrenderService {

    @Autowired
    private GetExistingSurrenderOverallDetails_PolicySurrenderRepository getExistingSurrenderOverallDetails_PolicySurrenderRepository;

    public Optional<PolicySurrenderApiResponse> findBySurrenderId(Long surrenderId) {
        return getExistingSurrenderOverallDetails_PolicySurrenderRepository.findBySurrenderId(surrenderId);
    }

    public PolicySurrenderApiResponse getExistingSurrenderOverallDetails_PolicySurrender(Long surrenderId) {
        return getExistingSurrenderOverallDetails_PolicySurrenderRepository.getExistingSurrenderOverallDetails_PolicySurrender(surrenderId);
    }
}