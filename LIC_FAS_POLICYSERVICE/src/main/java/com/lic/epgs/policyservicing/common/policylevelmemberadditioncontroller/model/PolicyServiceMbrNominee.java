package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "policy_service_mbr_nominee")
public class PolicyServiceMbrNominee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "member_number")
    private String memberNumber;

    @Column(name = "member_name")
    private String memberName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "policy_service_mbr_nominee_id")
    private List<NomineeDetails> nomineeDetails;

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

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public List<NomineeDetails> getNomineeDetails() {
        return nomineeDetails;
    }

    public void setNomineeDetails(List<NomineeDetails> nomineeDetails) {
        this.nomineeDetails = nomineeDetails;
    }
}