package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTemp;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyLevelMergerService {

    @Autowired
    private PolicyLevelMergerRepository policyLevelMergerRepository;

    public void updateStatus(Boolean status, String modifiedBy, Long id) {
        policyLevelMergerRepository.updateStatus(status, modifiedBy, id);
    }

    public void saveAndUpdatePolicyLevelMerger(PolicyLevelMergerDto policyLevelMergerDto,
                                               PolicyLevelMergerApiResponse response) {
        policyLevelMergerRepository.saveAndUpdatePolicyLevelMerger(policyLevelMergerDto, response);
    }

    public boolean validPolicyNumberAndType(String policyNumber, String policyType) {
        return policyLevelMergerRepository.validPolicyNumberAndType(policyNumber, policyType);
    }
}