package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_conversion_details")
public class PolicyConversionDetails {

    @Id
    private int id;
    private String role;
    private String unitCode;
    // other fields, getters and setters
}