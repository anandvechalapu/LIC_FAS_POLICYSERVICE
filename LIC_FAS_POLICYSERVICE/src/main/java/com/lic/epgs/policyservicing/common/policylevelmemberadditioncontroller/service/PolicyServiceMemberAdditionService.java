package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.PolicyServiceMemberAdditionEntity;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.PolicyServiceMemberAdditionRepository;

@Service
public class PolicyServiceMemberAdditionService {

    @Autowired
    private PolicyServiceMemberAdditionRepository policyServiceMemberAdditionRepository;

    public Optional<PolicyServiceMemberAdditionEntity> getPolicyServiceMemberAdditionEntityByMemberAdditionIdAndUnitCode(Long memberAdditionId, String unitCode) {

        return policyServiceMemberAdditionRepository.findByMemberAdditionIdAndUnitCode(memberAdditionId, unitCode);
    }

    public PolicyServiceMemberAdditionEntity save(PolicyServiceMemberAdditionEntity policyServiceMemberAdditionEntity) {

        return policyServiceMemberAdditionRepository.save(policyServiceMemberAdditionEntity);
    }

}