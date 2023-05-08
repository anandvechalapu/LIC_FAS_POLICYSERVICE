package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policylevelmemberadditioncontroller")
public class PolicyLevelMemberAdditionController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberAdditionId;

    private String notes;

    public Long getMemberAdditionId() {
        return memberAdditionId;
    }

    public void setMemberAdditionId(Long memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}