package com.lic.epgs.policyservicing.common.policyservicingcontroller.service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.SearchPolicyByPolicyIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchPolicyByPolicyIdService {

    @Autowired
    private SearchPolicyByPolicyIdRepository searchPolicyByPolicyIdRepository;

    public List<PolicyDetails> searchPolicyByPolicyId(String policyId) {
        return searchPolicyByPolicyIdRepository.searchPolicyByPolicyId(policyId);
    }
}