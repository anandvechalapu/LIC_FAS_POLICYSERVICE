package com.lic.epgs.policyservicing.common.policyservicingcontroller.model;

import java.io.Serializable;

/**
 * This class represents a model for policy service notes.
 */
public class PolicyServiceNotesDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String serviceId;
    private String policyId;
    private String serviceType;
    private String role;
    private int page;
    private String note;

    /**
     * Default constructor
     */
    public PolicyServiceNotesDto() {
        super();
    }

    /**
     * Constructor with arguments
     * 
     * @param serviceId string representing the service ID
     * @param policyId string representing the policy ID
     * @param serviceType string representing the service type. The value should be either POLSRV_TYPE or OTHER.
     * @param role string representing the role
     * @param page an integer representing the page number
     * @param note string representing the note
     */
    public PolicyServiceNotesDto(String serviceId, String policyId, String serviceType, String role, int page, String note) {
        super();
        this.serviceId = serviceId;
        this.policyId = policyId;
        this.serviceType = serviceType;
        this.role = role;
        this.page = page;
        this.note = note;
    }

    /**
     * @return the serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return the policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * @param policyId the policyId to set
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * @return the serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * @param serviceType the serviceType to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

}