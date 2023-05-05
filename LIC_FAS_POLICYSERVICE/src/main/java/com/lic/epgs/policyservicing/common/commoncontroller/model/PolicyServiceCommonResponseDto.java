package com.lic.epgs.policyservicing.common.commoncontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyServiceCommonResponseDto {
    @Id
    private Long policyId;
    private String serviceName;
    private String serviceDescription;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
}