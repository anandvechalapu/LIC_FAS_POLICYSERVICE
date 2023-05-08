package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.FreeLookCancellation;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.FreeLookCancellationService;

@RestController
@RequestMapping("/freelook")
public class FreeLookCancellationController {

	@Autowired
	private FreeLookCancellationService freeLookCancellationService;

	@GetMapping
	public List<FreeLookCancellation> getFreeLookCancellations() {
		return freeLookCancellationService.getExistingFreeLookCancellationById();
	}

	@GetMapping("/{freeLookId}")
	public FreeLookCancellation getFreeLookCancellationById(@PathVariable Long freeLookId) {
		return freeLookCancellationService.getExistingFreeLookCancellationById(freeLookId);
	}

	@GetMapping("/mphbank/{freeLookId}")
	public List<MphBankDto> getMphBankDtosByFreeLookId(@PathVariable Long freeLookId) {
		return freeLookCancellationService.getMphBankDtosByFreeLookId(freeLookId);
	}

	@PostMapping
	public FreeLookCancellation saveFreeLookCancellation(@RequestBody FreeLookCancellation freeLookCancellation) {
		return freeLookCancellationService.saveFreeLookCancellation(freeLookCancellation);
	}

	@PutMapping
	public FreeLookCancellation updateFreeLookCancellation(@RequestBody FreeLookCancellation freeLookCancellation) {
		return freeLookCancellationService.saveFreeLookCancellation(freeLookCancellation);
	}

	@DeleteMapping("/{freeLookId}")
	public void deleteFreeLookCancellation(@PathVariable Long freeLookId) {
		freeLookCancellationService.deleteFreeLookCancellation(freeLookId);
	}
}