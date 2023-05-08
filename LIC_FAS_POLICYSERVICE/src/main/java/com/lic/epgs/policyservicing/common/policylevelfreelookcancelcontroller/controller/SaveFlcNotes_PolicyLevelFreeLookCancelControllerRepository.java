@Repository
public class SaveFlcNotes_PolicyLevelFreeLookCancelControllerRepository {

    public FreeLookCancellationResponseDto saveFlcNotes(Long freeLookId, Long policyId, Long serviceId, String notesText) {
        FreeLookCancellationResponseDto freeLookCancellationResponseDto = new FreeLookCancellationResponseDto();
        freeLookCancellationResponseDto.setFreeLookId(freeLookId);
        freeLookCancellationResponseDto.setPolicyId(policyId);
        freeLookCancellationResponseDto.setServiceId(serviceId);
        freeLookCancellationResponseDto.setNotesText(notesText);
        return freeLookCancellationResponseDto;
    }
}

package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.SaveFlcNotes_PolicyLevelFreeLookCancelControllerService;

@RestController
public class SaveFlcNotes_PolicyLevelFreeLookCancelController {
	
	@Autowired
	private SaveFlcNotes_PolicyLevelFreeLookCancelControllerService saveFlcNotes_PolicyLevelFreeLookCancelControllerService;
	
	@PostMapping("/saveFlcNotes")
	public FreeLookCancellationResponseDto saveFlcNotes(@RequestBody FreeLookCancellationResponseDto freeLookCancellationResponseDto) {
		return saveFlcNotes_PolicyLevelFreeLookCancelControllerService.saveFlcNotes(freeLookCancellationResponseDto.getFreeLookId(), freeLookCancellationResponseDto.getPolicyId(), freeLookCancellationResponseDto.getServiceId(), freeLookCancellationResponseDto.getNotesText());
	}

}