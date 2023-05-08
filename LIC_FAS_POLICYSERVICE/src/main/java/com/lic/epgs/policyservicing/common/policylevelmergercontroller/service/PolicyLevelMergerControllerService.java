package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyServiceDocumentDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerControllerRepository;

@Service
public class PolicyLevelMergerControllerService {
    
    @Autowired
    private PolicyLevelMergerControllerRepository policyLevelMergerControllerRepository;
    
    /**
     * Get a list of policy documents for a given merge ID.
     *
     * @param mergeId The ID of the policy merge.
     * @return A list of PolicyServiceDocumentDto objects, or an empty list if no documents are found.
     */
    public List<PolicyServiceDocumentDto> getDocumentList(Long mergeId) {
        return policyLevelMergerControllerRepository.getDocumentList(mergeId);
    }
}