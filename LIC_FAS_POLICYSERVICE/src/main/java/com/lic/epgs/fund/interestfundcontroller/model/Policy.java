package com.lic.epgs.fund.interestfundcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String policyNo;
    private String policyStart;

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

    public String getPolicyStart() {
        return policyStart;
    }

    public void setPolicyStart(String policyStart) {
        this.policyStart = policyStart;
    }
}