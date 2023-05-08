package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_SERVICE_NOTES")
public class PolicyServiceNotesDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "NOTE_ID")
  private Long noteId;

  @Column(name = "MERGE_ID")
  private Long mergeId;

  @Column(name = "NOTE_TEXT")
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