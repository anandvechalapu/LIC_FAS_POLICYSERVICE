package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model;

import java.util.List;

/**
 * Model class to represent the list of existing policy conversion details
 */
public class GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerModel {

    private String role;
    private String unitCode;
    private List<Object> existingPolicyConversionDetailsList;

    /**
     * Default constructor
     */
    public GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerModel(){}

    /**
     * Parameterized constructor
     * @param role The role of the user
     * @param unitCode The unit code of the user
     * @param existingPolicyConversionDetailsList The list of existing policy conversion details
     */
    public GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerModel(String role, String unitCode, List<Object> existingPolicyConversionDetailsList){
        this.role = role;
        this.unitCode = unitCode;
        this.existingPolicyConversionDetailsList = existingPolicyConversionDetailsList;
    }

    /**
     * Getter for the role of the user
     * @return The role of the user
     */
    public String getRole(){
        return this.role;
    }

    /**
     * Setter for the role of the user
     * @param role The role of the user
     */
    public void setRole(String role){
        this.role = role;
    }

    /**
     * Getter for the unit code of the user
     * @return The unit code of the user
     */
    public String getUnitCode(){
        return this.unitCode;
    }

    /**
     * Setter for the unit code of the user
     * @param unitCode The unit code of the user
     */
    public void setUnitCode(String unitCode){
        this.unitCode = unitCode;
    }

    /**
     * Getter for the list of existing policy conversion details
     * @return The list of existing policy conversion details
     */
    public List<Object> getExistingPolicyConversionDetailsList(){
        return this.existingPolicyConversionDetailsList;
    }

    /**
     * Setter for the list of existing policy conversion details
     * @param existingPolicyConversionDetailsList The list of existing policy conversion details
     */
    public void setExistingPolicyConversionDetailsList(List<Object> existingPolicyConversionDetailsList){
        this.existingPolicyConversionDetailsList = existingPolicyConversionDetailsList;
    }

}