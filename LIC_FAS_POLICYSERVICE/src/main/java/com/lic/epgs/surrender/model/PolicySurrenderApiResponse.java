package com.lic.epgs.surrender.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "PolicySurrenderApiResponse")
public class PolicySurrenderApiResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long surrenderId;

    @Column(name = "surrenderType")
    String surrenderType;

    @Column(name = "surrenderTypeDetails")
    String surrenderTypeDetails;

    @Column(name = "surrenderAmount")
    Double surrenderAmount;

    @Column(name = "surrenderAmountDetails")
    String surrenderAmountDetails;

    @Column(name = "surrenderChargeDetails")
    String surrenderChargeDetails;

    @Column(name = "surrenderCharge")
    Double surrenderCharge;

    @Column(name = "surrenderTaxAmount")
    Double surrenderTaxAmount;

    @Column(name = "surrenderTaxDetails")
    String surrenderTaxDetails;

    @Column(name = "surrenderNetPayableAmount")
    Double surrenderNetPayableAmount;

    @Column(name = "surrenderNetPayableAmountDetails")
    String surrenderNetPayableAmountDetails;

    @Column(name = "surrenderStatus")
    String surrenderStatus;

    public Long getSurrenderId() {
        return surrenderId;
    }

    public void setSurrenderId(Long surrenderId) {
        this.surrenderId = surrenderId;
    }

    public String getSurrenderType() {
        return surrenderType;
    }

    public void setSurrenderType(String surrenderType) {
        this.surrenderType = surrenderType;
    }

    public String getSurrenderTypeDetails() {
        return surrenderTypeDetails;
    }

    public void setSurrenderTypeDetails(String surrenderTypeDetails) {
        this.surrenderTypeDetails = surrenderTypeDetails;
    }

    public Double getSurrenderAmount() {
        return surrenderAmount;
    }

    public void setSurrenderAmount(Double surrenderAmount) {
        this.surrenderAmount = surrenderAmount;
    }

    public String getSurrenderAmountDetails() {
        return surrenderAmountDetails;
    }

    public void setSurrenderAmountDetails(String surrenderAmountDetails) {
        this.surrenderAmountDetails = surrenderAmountDetails;
    }

    public String getSurrenderChargeDetails() {
        return surrenderChargeDetails;
    }

    public void setSurrenderChargeDetails(String surrenderChargeDetails) {
        this.surrenderChargeDetails = surrenderChargeDetails;
    }

    public Double getSurrenderCharge() {
        return surrenderCharge;
    }

    public void setSurrenderCharge(Double surrenderCharge) {
        this.surrenderCharge = surrenderCharge;
    }

    public Double getSurrenderTaxAmount() {
        return surrenderTaxAmount;
    }

    public void setSurrenderTaxAmount(Double surrenderTaxAmount) {
        this.surrenderTaxAmount = surrenderTaxAmount;
    }

    public String getSurrenderTaxDetails() {
        return surrenderTaxDetails;
    }

    public void setSurrenderTaxDetails(String surrenderTaxDetails) {
        this.surrenderTaxDetails = surrenderTaxDetails;
    }

    public Double getSurrenderNetPayableAmount() {
        return surrenderNetPayableAmount;
    }

    public void setSurrenderNetPayableAmount(Double surrenderNetPayableAmount) {
        this.surrenderNetPayableAmount = surrenderNetPayableAmount;
    }

    public String getSurrenderNetPayableAmountDetails() {
        return surrenderNetPayableAmountDetails;
    }

    public void setSurrenderNetPayableAmountDetails(String surrenderNetPayableAmountDetails) {
        this.surrenderNetPayableAmountDetails = surrenderNetPayableAmountDetails;
    }

    public String getSurrenderStatus() {
        return surrenderStatus;
    }

    public void setSurrenderStatus(String surrenderStatus) {
        this.surrenderStatus = surrenderStatus;
    }
}