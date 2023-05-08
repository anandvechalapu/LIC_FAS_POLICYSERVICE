package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_AOM")
public class PolicyAom implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "POLICY_NUMBER")
	private String policyNumber;

	@Column(name = "MPH_NAME")
	private String mphName;

	@Column(name = "MPH_CODE")
	private String mphCode;

	@Column(name = "LINE_OF_BUSINESS")
	private String lineOfBusiness;

	@Column(name = "PRODUCT_ID")
	private String productId;

	@Column(name = "VARIANT")
	private String variant;

	@Column(name = "NO_OF_CATEGORY")
	private Integer noOfCategory;

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
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

	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public Integer getNoOfCategory() {
		return noOfCategory;
	}

	public void setNoOfCategory(Integer noOfCategory) {
		this.noOfCategory = noOfCategory;
	}

}