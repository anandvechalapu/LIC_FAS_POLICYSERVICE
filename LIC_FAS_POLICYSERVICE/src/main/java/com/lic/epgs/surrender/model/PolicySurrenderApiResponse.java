package com.lic.epgs.surrender.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicySurrenderApiResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surrenderId;
    private String type;
    private String documentName;
    private String documentLink;

    public Long getSurrenderId() {
        return surrenderId;
    }

    public void setSurrenderId(Long surrenderId) {
        this.surrenderId = surrenderId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentLink() {
        return documentLink;
    }

    public void setDocumentLink(String documentLink) {
        this.documentLink = documentLink;
    }
}