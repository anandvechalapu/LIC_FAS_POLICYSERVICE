package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_service_mbr_apponintee")
public class PolicyServiceMbrApponinteeDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;

    private Long appointeeId;

    private int active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getAppointeeId() {
        return appointeeId;
    }

    public void setAppointeeId(Long appointeeId) {
        this.appointeeId = appointeeId;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}