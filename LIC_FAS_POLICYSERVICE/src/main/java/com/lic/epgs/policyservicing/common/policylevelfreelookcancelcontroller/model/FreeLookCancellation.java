package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.FreeLookCancellationEntity;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.MphBankDto;

@Entity
public class FreeLookCancellation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNo;

    private String customerId;

    private String policyHolderName;

    private String productName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "policy_master_id")
    private PolicyMaster policyMaster;

    @OneToMany(mappedBy = "freeLookCancellation")
    private List<MphBankDto> mphBankDtos;

    public FreeLookCancellation() {
    }

    public FreeLookCancellation(FreeLookCancellationEntity freeLookCancellationEntity) {
        this.id = freeLookCancellationEntity.getId();
        this.policyNo = freeLookCancellationEntity.getPolicyNo();
        this.customerId = freeLookCancellationEntity.getCustomerId();
        this.policyHolderName = freeLookCancellationEntity.getPolicyHolderName();
        this.productName = freeLookCancellationEntity.getProductName();
        this.policyMaster = freeLookCancellationEntity.getPolicyMaster();
        this.mphBankDtos = freeLookCancellationEntity.getMphBankDtos();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public PolicyMaster getPolicyMaster() {
        return policyMaster;
    }

    public void setPolicyMaster(PolicyMaster policyMaster) {
        this.policyMaster = policyMaster;
    }

    public List<MphBankDto> getMphBankDtos() {
        return mphBankDtos;
    }

    public void setMphBankDtos(List<MphBankDto> mphBankDtos) {
        this.mphBankDtos = mphBankDtos;
    }
}