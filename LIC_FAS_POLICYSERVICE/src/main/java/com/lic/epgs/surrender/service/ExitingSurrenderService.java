package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.repository.ExitingSurrenderRepository;
import com.lic.epgs.transaction.model.TransactionStatus;
import com.lic.epgs.transaction.response.PolicySurrenderApiResponse;
import com.lic.epgs.transaction.response.dto.PolicySurrenderDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ExitingSurrenderService {

    @Autowired
    ExitingSurrenderRepository repository;

    public PolicySurrenderApiResponse getExitingSurrenderPolicies(String roleType, String pageName) {
        return repository.getExitingSurrenderPolicies(roleType, pageName);
    }
}