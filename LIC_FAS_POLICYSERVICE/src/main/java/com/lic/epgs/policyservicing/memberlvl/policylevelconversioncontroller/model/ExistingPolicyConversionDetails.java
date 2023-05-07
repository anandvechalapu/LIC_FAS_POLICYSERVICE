package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExistingPolicyConversionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String role;
    private String unitCode;
    private String currentPolicyLevel;
    private String newPolicyLevel;
    private String newPolicyLevelStartDate;
    private String newPolicyLevelEndDate;
    private String conversionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getCurrentPolicyLevel() {
        return currentPolicyLevel;
    }

    public void setCurrentPolicyLevel(String currentPolicyLevel) {
        this.currentPolicyLevel = currentPolicyLevel;
    }

    public String getNewPolicyLevel() {
        return newPolicyLevel;
    }

    public void setNewPolicyLevel(String newPolicyLevel) {
        this.newPolicyLevel = newPolicyLevel;
    }

    public String getNewPolicyLevelStartDate() {
        return newPolicyLevelStartDate;
    }

    public void setNewPolicyLevelStartDate(String newPolicyLevelStartDate) {
        this.newPolicyLevelStartDate = newPolicyLevelStartDate;
    }

    public String getNewPolicyLevelEndDate() {
        return newPolicyLevelEndDate;
    }

    public void setNewPolicyLevelEndDate(String newPolicyLevelEndDate) {
        this.newPolicyLevelEndDate = newPolicyLevelEndDate;
    }

    public String getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(String conversionDate) {
        this.conversionDate = conversionDate;
    }

}