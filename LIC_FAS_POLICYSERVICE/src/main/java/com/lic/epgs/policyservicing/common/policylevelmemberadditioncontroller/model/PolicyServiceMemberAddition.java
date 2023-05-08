package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import javax.persistence.*;

@Entity
@Table(name="POLICY_SERVICE_MEMBER_ADDITION")
public class PolicyServiceMemberAddition {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="MPH_NAME")
    private String mphName;

    @Column(name="MPH_CODE")
    private String mphCode;

    @Column(name="PRODUCT")
    private String product;

    @Column(name="LINE_OF_BUSINESS")
    private String lineOfBusiness;

    @Column(name="MEMBER_ADDITION_STATUS")
    private String memberAdditionStatus;

    @Column(name="UNIT_CODE")
    private String unitCode;

    @Column(name="SERVICE_NUMBER")
    private String serviceNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMphName() {
        return mphName;
    }

    public void setMphName(String mphName) {
        this.mphName = mphName;
    }

    public String getMphCode() {
        return mphCode;
    }

    public void setMphCode(String mphCode) {
        this.mphCode = mphCode;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getMemberAdditionStatus() {
        return memberAdditionStatus;
    }

    public void setMemberAdditionStatus(String memberAdditionStatus) {
        this.memberAdditionStatus = memberAdditionStatus;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }
}