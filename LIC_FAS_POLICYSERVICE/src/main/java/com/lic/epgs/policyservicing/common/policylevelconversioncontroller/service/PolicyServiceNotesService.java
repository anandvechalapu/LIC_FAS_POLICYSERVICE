package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.PolicyServiceNotes;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.PolicyServiceNotesRepository;

@Service
public class PolicyServiceNotesService {
    
    @Autowired
    private PolicyServiceNotesRepository policyServiceNotesRepository;

    /**
     * Retrieves a list of policy service notes by providing a service ID.
     *
     * @param serviceId The service ID to retrieve the policy service notes for.
     * @return A list of policy service notes.
     */
    public List<PolicyServiceNotes> getNotesDetailsList_PolicyLevelConversionController(Long serviceId) {
        return policyServiceNotesRepository.getNotesDetailsList_PolicyLevelConversionController(serviceId);
    }
}