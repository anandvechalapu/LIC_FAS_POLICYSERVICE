package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;

@Entity
public class FreeLookCancellationTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long freeLookCancellationId;

    private String policyNumber;
    private String extPolicyNumber;
    private Long policyHolderId;
    private Long policyProductId;
    private String policyHolderName;
    private String policyHolderGender;
    private String policyHolderDOB;
    private String policyHolderAddress;
    private String freeLookCancellationDate;
    private String freeLookCancellationReason;

    public FreeLookCancellationResponseDto getFreeLookCancellationDetails(Long freeLookCancellationId) {
        FreeLookCancellationResponseDto freeLookCancellationResponseDto = new FreeLookCancellationResponseDto();
        freeLookCancellationResponseDto.setPolicyNumber(this.policyNumber);
        freeLookCancellationResponseDto.setExtPolicyNumber(this.extPolicyNumber);
        freeLookCancellationResponseDto.setPolicyHolderId(this.policyHolderId);
        freeLookCancellationResponseDto.setPolicyProductId(this.policyProductId);
        freeLookCancellationResponseDto.setPolicyHolderName(this.policyHolderName);
        freeLookCancellationResponseDto.setPolicyHolderGender(this.policyHolderGender);
        freeLookCancellationResponseDto.setPolicyHolderDOB(this.policyHolderDOB);
        freeLookCancellationResponseDto.setPolicyHolderAddress(this.policyHolderAddress);
        freeLookCancellationResponseDto.setFreeLookCancellationDate(this.freeLookCancellationDate);
        freeLookCancellationResponseDto.setFreeLookCancellationReason(this.freeLookCancellationReason);
        return freeLookCancellationResponseDto;
    }

    public Long getFreeLookCancellationId() {
        return freeLookCancellationId;
    }

    public void setFreeLookCancellationId(Long freeLookCancellationId) {
        this.freeLookCancellationId = freeLookCancellationId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getExtPolicyNumber() {
        return extPolicyNumber;
    }

    public void setExtPolicyNumber(String extPolicyNumber) {
        this.extPolicyNumber = extPolicyNumber;
    }

    public Long getPolicyHolderId() {
        return policyHolderId;
    }

    public void setPolicyHolderId(Long policyHolderId) {
        this.policyHolderId = policyHolderId;
    }

    public Long getPolicyProductId() {
        return policyProductId;
    }

    public void setPolicyProductId(Long policyProductId) {
        this.policyProductId = policyProductId;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyHolderGender() {
        return policyHolderGender;
    }

    public void setPolicyHolderGender(String policyHolderGender) {
        this.policyHolderGender = policyHolderGender;
    }

    public String getPolicyHolderDOB() {
        return policyHolderDOB;
    }

    public void setPolicyHolderDOB(String policyHolderD