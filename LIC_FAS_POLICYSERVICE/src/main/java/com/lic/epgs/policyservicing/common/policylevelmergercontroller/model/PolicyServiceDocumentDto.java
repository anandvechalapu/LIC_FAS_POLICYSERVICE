package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import java.util.List;

import org.springframework.http.ResponseEntity;

public class PolicyServiceDocumentDto {

    private String documentId;
    private String documentName;
    private String documentType;
    private List<String> documentContent;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
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

    public List<String> getDocumentContent() {
        return documentContent;
    }

    public void setDocumentContent(List<String> documentContent) {
        this.documentContent = documentContent;
    }
}