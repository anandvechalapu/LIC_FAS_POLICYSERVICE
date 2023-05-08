package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.GetNoteList_PolicyLevelMergerControllerRepository;

@Service
public class GetNoteList_PolicyLevelMergerControllerService {

	@Autowired
	private GetNoteList_PolicyLevelMergerControllerRepository repo;
	
	public PolicyLevelMergerApiResponse getNoteList(String mergeId) {
		return repo.getNoteList(mergeId);
	}
	
}