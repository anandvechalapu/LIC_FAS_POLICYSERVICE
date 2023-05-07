package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.repository.PolicySearchForSurrenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicySearchForSurrenderService {

    @Autowired
    private PolicySearchForSurrenderRepository policySearchForSurrenderRepository;

    public List<PolicySearchForSurrender> getPolicyDetailsByPolicyNumber(int policyNumber){
        return policySearchForSurrenderRepository.getPolicyDetailsByPolicyNumber(policyNumber);
    }

    public boolean isPolicyNumberExists(int policyNumber){
        return policySearchForSurrenderRepository.isPolicyNumberExists(policyNumber);
    }

    public PolicySearchForSurrender getResponseObject(int policyNumber){
        return policySearchForSurrenderRepository.getResponseObject(policyNumber);
    }

    public String getErrorMessage(int policyNumber){
        return policySearchForSurrenderRepository.getErrorMessage(policyNumber);
    }

    public String getTransactionStatus(int policyNumber){
        return policySearchForSurrenderRepository.getTransactionStatus(policyNumber);
    }

    public String getTransactionMessage(int policyNumber){
        return policySearchForSurrenderRepository.getTransactionMessage(policyNumber);
    }
}