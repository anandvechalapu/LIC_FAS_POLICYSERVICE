package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import javax.persistence.*;

@Entity
@Table(name="policyservicenotestemp")
public class PolicyServiceNotesTempEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="policyid")
    private Long policyId;

    @Column(name="notes")
    private String notes;

    @Column(name="active")
    private Boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}