package com.lic.epgs.surrender.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.surrender.model.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.repository.GetSurrenderDocumentDetailsRepository;

@Service
public class GetSurrenderDocumentDetailsService {

    @Autowired
    private GetSurrenderDocumentDetailsRepository getSurrenderDocumentDetailsRepository;

    public Optional<PolicySurrenderApiResponse> getSurrenderDocumentDetails(Long surrenderId) {
        return getSurrenderDocumentDetailsRepository.findBySurrenderId(surrenderId);
    }

}