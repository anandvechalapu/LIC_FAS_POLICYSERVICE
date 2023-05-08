package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DocumentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long conversionId;

    private String documentName;

    private byte[] documentContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConversionId() {
        return conversionId;
    }

    public void setConversionId(Long conversionId) {
        this.conversionId = conversionId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public byte[] getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(byte[] documentContent) {
        this.documentContent = documentContent;
    }

}