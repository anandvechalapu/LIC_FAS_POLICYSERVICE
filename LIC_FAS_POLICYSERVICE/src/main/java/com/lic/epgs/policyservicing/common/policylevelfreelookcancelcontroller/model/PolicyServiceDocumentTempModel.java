package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="policy_service_document_temp")
public class PolicyServiceDocumentTempModel {

    @Column(name="document_id")
    private Long documentId;

    @Column(name="document_name")
    private String documentName;

    @Column(name="document_type")
    private String documentType;

    @Column(name="document_status")
    private String documentStatus;

    @Column(name="document_location")
    private String documentLocation;

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getDocumentLocation() {
        return documentLocation;
    }

    public void setDocumentLocation(String documentLocation) {
        this.documentLocation = documentLocation;
    }

}