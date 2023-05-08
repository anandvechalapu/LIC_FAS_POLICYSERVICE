package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "policy_criteria_search_policy_level_conversion_controller")
public class PolicyCriteriaSearchPolicyLevelConversionController {
    
    @Id
    private Long id;
    private String policyNo;
    // other fields
    
    // getters and setters
}