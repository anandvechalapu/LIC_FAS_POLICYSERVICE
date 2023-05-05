package com.lic.epgs.integration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AccountingIntegrationRequestDto")
public class AccountingIntegrationRequestDto {

    @Id
    @Column(name="id")
    private Long id;
    
    @Column(name="schemeName")
    private String schemeName;

    @Column(name="mphCode")
    private String mphCode;

    @Column(name="mphName")
    private String mphName;

    @Column(name="mphNo")
    private String mphNo;

    @Column(name="mphMobileNo")
    private String mphMobileNo;

    @Column(name="mphEmail")
    private String mphEmail;

    @Column(name="mphAddress1")
    private String mphAddress1;

    @Column(name="mphAddress2")
    private String mphAddress2;

    @Column(name="district")
    private String district;

    @Column(name="state")
    private String state;

    @Column(name="pinCode")
    private Long pinCode;

    @Column(name="servicingUnitName")
    private String servicingUnitName;

    @Column(name="servicingUnitAddress1")
    private String servicingUnitAddress1;

    @Column(name="servicingUnitAddress2")
    private String servicingUnitAddress2;

    @Column(name="servicingUnitAddress3")
    private String servicingUnitAddress3;

    @Column(name="servicingUnitAddress4")
    private String servicingUnitAddress4;

    @Column(name="servicingUnitCity")
    private String servicingUnitCity;

    @Column(name="servicingUnitPincode")
    private Long servicingUnitPincode;

    @Column(name="servicingUnitEmail")
    private String servicingUnitEmail;

    @Column(name="servicingUnitPhoneNo")
    private Long servicingUnitPhoneNo;

    @Column(name="operatingUnitType")
    private String operatingUnitType;

    @Column(name="unitCode")
    private String unitCode;

    @Column(name="ICodeForLob")
    private String ICodeForLob;

    @Column(name="ICodeForProductLine")
    private String ICodeForProductLine;

    @Column(name="ICodeForVariant")
    private String ICodeForVariant;

    @Column(name="ICodeForBusinessType")
    private String ICodeForBusinessType;

    @Column(name="ICodeForParticipatingType")
    private String ICodeForParticipatingType;

    @Column(name="ICodeForBusinessSegment")
    private String ICodeForBusinessSegment;

    @Column(name="ICodeForInvestmentPortfolio")
    private String ICodeForInvestmentPortfolio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getMphCode() {
        return mphCode;
    }

    public void setMphCode(String mphCode) {
        this.mphCode = mphCode;
    }

    public String getMphName() {
        return mphName;
    }

    public void setMphName(String mphName) {
        this.mphName = mphName;
    }

    public String getMphNo() {
        return mphNo;
    }

    public void setMphNo(String mphNo) {
        this.mphNo = mphNo;
    }

    public String getMphMobileNo() {
        return mphMobileNo;
    }

    public void setMphMobileNo(String mphMobileNo) {
        this.mphMobileNo = mphMobileNo;
    }

    public String getMphEmail() {
        return mphEmail;
    }

    public void setMphEmail(String mphEmail) {
        this.mphEmail = mphEmail;
    }

    public