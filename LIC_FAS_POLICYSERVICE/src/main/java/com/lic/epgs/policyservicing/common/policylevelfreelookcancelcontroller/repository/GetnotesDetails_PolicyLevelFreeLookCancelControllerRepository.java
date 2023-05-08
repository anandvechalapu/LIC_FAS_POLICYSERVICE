package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.NotesDetails;

@Repository
public interface GetnotesDetails_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<NotesDetails, Integer> {
	
	@Query("SELECT n FROM NotesDetails n WHERE n.freeLookId = ?1")
    public NotesDetails findByFreeLookId(int freeLookId);
	
}