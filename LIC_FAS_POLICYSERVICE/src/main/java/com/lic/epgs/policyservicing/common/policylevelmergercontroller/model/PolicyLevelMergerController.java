package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import java.util.List;

public class PolicyLevelMergerController {
    private Long mergeId;
    private List<PolicyServiceDocumentDto> documentList;

    public Long getMergeId() {
        return mergeId;
    }

    public void setMergeId(Long mergeId) {
        this.mergeId = mergeId;
    }

    public List<PolicyServiceDocumentDto> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<PolicyServiceDocumentDto> documentList) {
        this.documentList = documentList;
    }
}