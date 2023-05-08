package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "SearchParametersDto", description = "Object to hold the search parameters for citriea search.")
public class SearchParametersDto {

    @NotNull
    @ApiModelProperty(value = "The policy number to be used for search.", required = true)
    private String policyNumber;

    @NotNull
    @ApiModelProperty(value = "The policy type to be used for search.", required = true)
    private String policyType;

    @NotNull
    @ApiModelProperty(value = "The policy year to be used for search.", required = true)
    private String policyYear;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyYear() {
        return policyYear;
    }

    public void setPolicyYear(String policyYear) {
        this.policyYear = policyYear;
    }

}

package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "PolicyResponseDto", description = "Object to hold the policy details returned from citriea search.")
public class PolicyResponseDto {

    @ApiModelProperty(value = "The policy number of the searched policy.", required = true)
    private String policyNumber;

    @ApiModelProperty(value = "The policy type of the searched policy.", required = true)
    private String policyType;

    @ApiModelProperty(value = "The policy year of the searched policy.", required = true)
    private String policyYear;

    @ApiModelProperty(value = "The policy level of the searched policy.", required = true)
    private String policyLevel;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyYear() {
        return policyYear;
    }

    public void setPolicyYear(String policyYear) {
        this.policyYear = policyYear;
    }

    public String getPolicyLevel() {
        return policyLevel;
    }

    public void setPolicyLevel(String policyLevel) {
        this.policyLevel = policyLevel;
    }

}