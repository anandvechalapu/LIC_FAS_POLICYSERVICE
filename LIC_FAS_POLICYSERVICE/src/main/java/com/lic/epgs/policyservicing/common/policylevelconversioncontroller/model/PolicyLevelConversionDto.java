package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyLevelConversionDto {

    @Id
    private String prevPolicyNo;
    private String currentPolicyNo;
    private String role;
    private String policyType;
    private String policyLevel;
    private String policyStatus;

// getters and setters
}