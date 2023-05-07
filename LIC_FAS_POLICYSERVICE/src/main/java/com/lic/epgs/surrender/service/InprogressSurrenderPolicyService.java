package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.dto.PolicySurrenderDTO;
import com.lic.epgs.surrender.repository.InprogressSurrenderPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InprogressSurrenderPolicyService {

    @Autowired
    private InprogressSurrenderPolicyRepository inprogressSurrenderPolicyRepository;

    public List<PolicySurrenderDTO> findByRoleType(String roleType) {
        return inprogressSurrenderPolicyRepository.findByRoleType(roleType);
    }

    public boolean existsByRoleTypeAndPageName(String roleType, String pageName) {
        return inprogressSurrenderPolicyRepository.existsByRoleTypeAndPageName(roleType, pageName);
    }

}