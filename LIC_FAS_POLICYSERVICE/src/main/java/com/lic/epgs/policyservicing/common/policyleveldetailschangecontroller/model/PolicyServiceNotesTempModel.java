package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyServiceNotesTempModel {

  @Id
  private Long policyId;
  private Long serviceId;
  private String notes;

  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public Long getServiceId() {
    return serviceId;
  }

  public void setServiceId(Long serviceId) {
    this.serviceId = serviceId;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

}