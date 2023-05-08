package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyRulesTempEntity;

@Repository
public interface SaveRulesDetailsPolicyLevelDetailsChangeControllerRepository extends JpaRepository<PolicyRulesTempEntity, Long> {

    PolicyRulesDto saveRulesDetails(PolicyRulesDto policyRulesDto);

}