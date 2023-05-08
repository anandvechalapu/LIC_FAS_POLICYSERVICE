package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import javax.persistence.*;

@Entity
public class PolicyRulesTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long policyId;

    private String ruleName;

    private String ruleValue;

    public PolicyRulesTempEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }
}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import java.util.List;

public class PolicyDtlsResponseDto {

    private String transactionStatus;

    private String transactionMessage;

    private List<PolicyRulesOldDto> policyRulesOldDtoList;

    public PolicyDtlsResponseDto() {
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public List<PolicyRulesOldDto> getPolicyRulesOldDtoList() {
        return policyRulesOldDtoList;
    }

    public void setPolicyRulesOldDtoList(List<PolicyRulesOldDto> policyRulesOldDtoList) {
        this.policyRulesOldDtoList = policyRulesOldDtoList;
    }
}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

public class PolicyRulesOldDto {

    private Long policyId;

    private String ruleName;

    private String ruleValue;

    public PolicyRulesOldDto() {
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }
}