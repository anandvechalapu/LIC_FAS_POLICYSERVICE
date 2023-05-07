package com.lic.epgs.surrender.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RejectPolicySurrender_PolicySurrender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String surrenderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurrenderStatus() {
        return surrenderStatus;
    }

    public void setSurrenderStatus(String surrenderStatus) {
        this.surrenderStatus = surrenderStatus;
    }
}