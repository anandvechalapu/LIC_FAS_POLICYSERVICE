package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerRepository;

@Service
public class PolicyLevelMergerService {

    @Autowired
    PolicyLevelMergerRepository policyLevelMergerRepository;

    public PolicyLevelMergerApiResponse getMasterPolicyMergebyMergeId(Long mergeId){
        return policyLevelMergerRepository.getMasterPolicyMergebyMergeId(mergeId);
    }

    public PolicyLevelMergerDto findByMergeId(Long mergeId){
        return policyLevelMergerRepository.findByMergeId(mergeId);
    }

    public List<PolicyServiceNotesDto> findByMergeIdAndIsActive(Long mergeId, Boolean isActive){
        return policyLevelMergerRepository.findByMergeIdAndIsActive(mergeId, isActive);
    }
}