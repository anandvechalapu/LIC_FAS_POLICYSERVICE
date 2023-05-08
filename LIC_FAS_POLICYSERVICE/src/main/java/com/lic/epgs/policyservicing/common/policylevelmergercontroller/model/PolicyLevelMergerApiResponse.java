package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import java.util.List;

public class PolicyLevelMergerApiResponse {

  private List<PolicyServiceNotesDto> notes;
  private String transactionStatus;
  private String transactionMessage;

  public List<PolicyServiceNotesDto> getNotes() {
    return notes;
  }

  public void setNotes(List<PolicyServiceNotesDto> notes) {
    this.notes = notes;
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
}

package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

public class PolicyServiceNotesDto {
  private Long noteId;
  private Long mergeId;
  private String noteText;

  public Long getNoteId() {
    return noteId;
  }

  public void setNoteId(Long noteId) {
    this.noteId = noteId;
  }

  public Long getMergeId() {
    return mergeId;
  }

  public void setMergeId(Long mergeId) {
    this.mergeId = mergeId;
  }

  public String getNoteText() {
    return noteText;
  }

  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }
}