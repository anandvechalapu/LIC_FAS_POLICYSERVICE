package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyServiceDocumentDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerControllerRepository;

@Service
public class PolicyLevelMergerControllerService {
 
    @Autowired
    private PolicyLevelMergerControllerRepository repository;
 
    public ResponseEntity<List<PolicyServiceDocumentDto>> getDocumentList(String mergeId) {
        return repository.getDocumentList(mergeId);
    }
}