package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FreeLookCancellationDto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyNumber;
    private String mphCode;
    private String mphName;
    private Date from;
    private Date to;
    private String product;
    private String lineOfBusiness;
    private String freeLookStatus;
    private String unitCode;

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

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
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

    public String getFreeLookStatus() {
        return freeLookStatus;
    }

    public void setFreeLookStatus(String freeLookStatus) {
        this.freeLookStatus = freeLookStatus;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

}