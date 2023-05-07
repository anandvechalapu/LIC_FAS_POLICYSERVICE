package com.lic.epgs.surrender.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MphBankDto {

    @Id
    private String mphId;
    private String bankName;
    private String bankBranch;
    private String bankAccountNo;
    private String bankIFSCCode;

    public String getMphId() {
        return mphId;
    }

    public void setMphId(String mphId) {
        this.mphId = mphId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankIFSCCode() {
        return bankIFSCCode;
    }

    public void setBankIFSCCode(String bankIFSCCode) {
        this.bankIFSCCode = bankIFSCCode;
    }
}

package com.lic.epgs.surrender.model;

public class PolicySurrenderApiResponse {

    private String transactionStatus;
    private String transactionMessage;
    private List<MphBankDto> policyBanks;

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

    public List<MphBankDto> getPolicyBanks() {
        return policyBanks;
    }

    public void setPolicyBanks(List<MphBankDto> policyBanks) {
        this.policyBanks = policyBanks;
    }
}