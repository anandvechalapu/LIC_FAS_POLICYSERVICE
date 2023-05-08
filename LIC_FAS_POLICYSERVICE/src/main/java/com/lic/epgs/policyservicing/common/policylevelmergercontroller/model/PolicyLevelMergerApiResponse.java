package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyLevelMergerApiResponse {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long documentId;
    private Long mergeId;
    private Boolean success;
    private String message;
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getDocumentId() {
        return documentId;
    }
 
    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }
 
    public Long getMergeId() {
        return mergeId;
    }
 
    public void setMergeId(Long mergeId) {
        this.mergeId = mergeId;
    }
 
    public Boolean getSuccess() {
        return success;
    }
 
    public void setSuccess(Boolean success) {
        this.success = success;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
}