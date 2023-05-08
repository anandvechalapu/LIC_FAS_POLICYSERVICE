package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.NotesDetails;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.GetnotesDetails_PolicyLevelFreeLookCancelControllerRepository;

@Service
public class GetnotesDetails_PolicyLevelFreeLookCancelControllerService {

	@Autowired
	GetnotesDetails_PolicyLevelFreeLookCancelControllerRepository getnotesDetails_PolicyLevelFreeLookCancelControllerRepository;
	
	public List<NotesDetails> getNotesDetailsByFreeLookId(int freeLookId) {
		return getnotesDetails_PolicyLevelFreeLookCancelControllerRepository.findByFreeLookId(freeLookId);
	}

}