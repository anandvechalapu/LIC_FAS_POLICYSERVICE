package com.lic.epgs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WebService {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // Customer fetch/Demographic API along with CRIF score
    Object customerData;

    // HLV/PASA sharing API 
    Object policyData;

    // Direct Debit API
    Object premiumPayments;

    // COI download API
    Object cois;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getCustomerData() {
        return customerData;
    }

    public void setCustomerData(Object customerData) {
        this.customerData = customerData;
    }

    public Object getPolicyData() {
        return policyData;
    }

    public void setPolicyData(Object policyData) {
        this.policyData = policyData;
    }

    public Object getPremiumPayments() {
        return premiumPayments;
    }

    public void setPremiumPayments(Object premiumPayments) {
        this.premiumPayments = premiumPayments;
    }

    public Object getCois() {
        return cois;
    }

    public void setCois(Object cois) {
        this.cois = cois;
    }

}