package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.NotesDetails;

@Repository
public interface GetnotesDetails_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<NotesDetails, Integer> {

	List<NotesDetails> findByFreeLookId(int freeLookId);

}

package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.NotesDetails;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.GetnotesDetails_PolicyLevelFreeLookCancelControllerService;

@RestController
@RequestMapping("/policylevelfreelookcancelcontroller")
public class PolicyLevelFreeLookCancelController {
	
	@Autowired
	GetnotesDetails_PolicyLevelFreeLookCancelControllerService getnotesDetails_PolicyLevelFreeLookCancelControllerService;
	
	@GetMapping("/getNotesDetailsByFreeLookId/{freeLookId}")
	public List<NotesDetails> getNotesDetailsByFreeLookId(@PathVariable int freeLookId) {
		return getnotesDetails_PolicyLevelFreeLookCancelControllerService.getNotesDetailsByFreeLookId(freeLookId);
	}
	
}