package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import java.io.Serializable;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;

public class PolicyLevelFreeLookCancelController implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private CommonResponseDto<Object> allMembers;
    private PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto;
    
    public PolicyLevelFreeLookCancelController() {
        // default constructor
    }

    public CommonResponseDto<Object> getAllMembers() {
        return allMembers;
    }

    public void setAllMembers(CommonResponseDto<Object> allMembers) {
        this.allMembers = allMembers;
    }

    public PolicyServiceMemberAdditionDto getPolicyServiceMemberAdditionDto() {
        return policyServiceMemberAdditionDto;
    }

    public void setPolicyServiceMemberAdditionDto(PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto) {
        this.policyServiceMemberAdditionDto = policyServiceMemberAdditionDto;
    }

}