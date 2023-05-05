package com.lic.epgs.policyservicing.common.memberlvl.model;

import javax.persistence.*;

@Entity
@Table(name="TransferInAndOutMaster")
public class TransferInAndOutMasterModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name="UnitCode")
    private String unitCode;

    @Column(name="TransferId")
    private String transferId;

    @Column(name="TransferinData")
    private String transferinData;

    @Column(name="TransferoutData")
    private String transferoutData;

    @Column(name="TransferinDataStatus")
    private int transferinDataStatus;

    @Column(name="TransferoutDataStatus")
    private int transferoutDataStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getTransferinData() {
        return transferinData;
    }

    public void setTransferinData(String transferinData) {
        this.transferinData = transferinData;
    }

    public String getTransferoutData() {
        return transferoutData;
    }

    public void setTransferoutData(String transferoutData) {
        this.transferoutData = transferoutData;
    }

    public int getTransferinDataStatus() {
        return transferinDataStatus;
    }

    public void setTransferinDataStatus(int transferinDataStatus) {
        this.transferinDataStatus = transferinDataStatus;
    }

    public int getTransferoutDataStatus() {
        return transferoutDataStatus;
    }

    public void setTransferoutDataStatus(int transferoutDataStatus) {
        this.transferoutDataStatus = transferoutDataStatus;
    }
}