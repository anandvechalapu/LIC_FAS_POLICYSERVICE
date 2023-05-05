package com.lic.epgs.policyservicing.common.policyservicingcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "policy_details")
public class PolicyDetails implements Serializable {

    @Id
    private String policyId;
    private String policyName;
    private String policyType;
    private String policyStartDate;
    private String policyEndDate;
    private double policyPremium;
    private double policySumAssured;

    public PolicyDetails(String policyId, String policyName, String policyType, String policyStartDate, String policyEndDate, double policyPremium, double policySumAssured) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.policyType = policyType;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
        this.policyPremium = policyPremium;
        this.policySumAssured = policySumAssured;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(String policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public String getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(String policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public double getPolicyPremium() {
        return policyPremium;
    }

    public void setPolicyPremium(double policyPremium) {
        this.policyPremium = policyPremium;
    }

    public double getPolicySumAssured() {
        return policySumAssured;
    }

    public void setPolicySumAssured(double policySumAssured) {
        this.policySumAssured = policySumAssured;
    }

}