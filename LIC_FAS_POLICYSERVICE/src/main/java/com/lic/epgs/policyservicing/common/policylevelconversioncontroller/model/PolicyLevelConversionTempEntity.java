package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_level_conversion_temp")
public class PolicyLevelConversionTempEntity {

    @Id
    private Long serviceId;
    private Object policyData;
    private Object conversionData;
    private String status;

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Object getPolicyData() {
        return policyData;
    }

    public void setPolicyData(Object policyData) {
        this.policyData = policyData;
    }

    public Object getConversionData() {
        return conversionData;
    }

    public void setConversionData(Object conversionData) {
        this.conversionData = conversionData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}