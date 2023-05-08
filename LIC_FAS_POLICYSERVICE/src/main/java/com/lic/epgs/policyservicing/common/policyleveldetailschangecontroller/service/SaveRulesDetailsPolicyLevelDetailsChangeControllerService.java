package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.SaveRulesDetailsPolicyLevelDetailsChangeControllerRepository;

@Service
public class SaveRulesDetailsPolicyLevelDetailsChangeControllerService {

    @Autowired
    SaveRulesDetailsPolicyLevelDetailsChangeControllerRepository saveRulesDetailsPolicyLevelDetailsChangeControllerRepository;

    public PolicyRulesDto saveRulesDetails(PolicyRulesDto policyRulesDto){
        PolicyRulesTempEntity policyRulesTempEntity = new PolicyRulesTempEntity();
        policyRulesTempEntity.setField1(policyRulesDto.getField1());
        policyRulesTempEntity.setField2(policyRulesDto.getField2());
        policyRulesTempEntity.setField3(policyRulesDto.getField3());
        policyRulesTempEntity.setField4(policyRulesDto.getField4());
        policyRulesTempEntity.setField5(policyRulesDto.getField5());
        policyRulesTempEntity.setField6(policyRulesDto.getField6());
        policyRulesTempEntity.setField7(policyRulesDto.getField7());
        policyRulesTempEntity.setField8(policyRulesDto.getField8());
        PolicyRulesTempEntity savedPolicyRulesTempEntity = saveRulesDetailsPolicyLevelDetailsChangeControllerRepository.save(policyRulesTempEntity);
        policyRulesDto.setId(savedPolicyRulesTempEntity.getId());
        return policyRulesDto;
    }

}