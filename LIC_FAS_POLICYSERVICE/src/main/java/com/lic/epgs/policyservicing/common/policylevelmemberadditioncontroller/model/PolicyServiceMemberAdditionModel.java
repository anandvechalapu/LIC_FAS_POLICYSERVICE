package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_service_member_addition")
public class PolicyServiceMemberAdditionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberAdditionId;

    @Column(name = "unit_code")
    private String unitCode;

    @Column(name = "member_addition_name")
    private String memberAdditionName;

    public Long getMemberAdditionId() {
        return memberAdditionId;
    }

    public void setMemberAdditionId(Long memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getMemberAdditionName() {
        return memberAdditionName;
    }

    public void setMemberAdditionName(String memberAdditionName) {
        this.memberAdditionName = memberAdditionName;
    }
}