// Entity/Model Class
package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FreeLookCancellation")
public class FreeLookCancellation {

    @Id
    private Long freeLookId;
    private String policyNumber;
    private String status;

    public Long getFreeLookId() {
        return freeLookId;
    }

    public void setFreeLookId(Long freeLookId) {
        this.freeLookId = freeLookId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}