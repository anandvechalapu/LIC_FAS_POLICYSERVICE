package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "policy_level_conversion")
public class PolicyLevelConversion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNumber;

    private String oldLevel;

    private String newLevel;

    private String userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getOldLevel() {
        return oldLevel;
    }

    public void setOldLevel(String oldLevel) {
        this.oldLevel = oldLevel;
    }

    public String getNewLevel() {
        return newLevel;
    }

    public void setNewLevel(String newLevel) {
        this.newLevel = newLevel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}