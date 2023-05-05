package com.lic.epgs.policyservicing.common.policyservicingcontroller.model;

import org.springframework.stereotype.Component;

@Component
public class PolicyServiceDocumentDto {

    private String documentName;
    private byte[] document;

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }
}

package com.lic.epgs.policyservicing.common.policyservicingcontroller.model;

import org.springframework.stereotype.Component;

@Component
public class CommonResponseDto {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}