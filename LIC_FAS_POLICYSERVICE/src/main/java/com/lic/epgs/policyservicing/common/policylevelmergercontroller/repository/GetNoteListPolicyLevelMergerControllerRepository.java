package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;

import java.util.List;

@Repository
public interface GetNoteListPolicyLevelMergerControllerRepository extends JpaRepository<PolicyServiceNotesDto, Long> {
  
  @Query("SELECT psn FROM PolicyServiceNotesDto psn WHERE psn.mergeId = :mergeId ORDER BY psn.noteId ASC")
  List<PolicyServiceNotesDto> findAllByMergeId(Long mergeId);
  
}