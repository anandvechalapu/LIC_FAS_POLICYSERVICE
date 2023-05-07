package com.lic.epgs.surrender.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.surrender.model.SavePolicyFullSurrenderPolicySurrender;
import com.lic.epgs.surrender.service.SavePolicyFullSurrenderPolicySurrenderService;

@RestController
@RequestMapping("/save-policy-full-surrender-policy-surrender")
public class SavePolicyFullSurrenderPolicySurrenderController {
	
	@Autowired
	private SavePolicyFullSurrenderPolicySurrenderService savePolicyFullSurrenderPolicySurrenderService;

	@PostMapping
	public ResponseEntity<SavePolicyFullSurrenderPolicySurrender> save(@RequestBody SavePolicyFullSurrenderPolicySurrender savePolicyFullSurrenderPolicySurrender) {
		SavePolicyFullSurrenderPolicySurrender savedSavePolicyFullSurrenderPolicySurrender = savePolicyFullSurrenderPolicySurrenderService.save(savePolicyFullSurrenderPolicySurrender);
		return new ResponseEntity<>(savedSavePolicyFullSurrenderPolicySurrender, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<SavePolicyFullSurrenderPolicySurrender>> findById(@PathVariable("id") Long id) {
		Optional<SavePolicyFullSurrenderPolicySurrender> savePolicyFullSurrenderPolicySurrender = savePolicyFullSurrenderPolicySurrenderService.findById(id);
		return new ResponseEntity<>(savePolicyFullSurrenderPolicySurrender, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") Long id) {
		savePolicyFullSurrenderPolicySurrenderService.deleteById(id);
	}

	@GetMapping("/mph-code-and-mph-name/{mphCode}")
	public ResponseEntity<List<Object[]>> findMphCodeAndMphNameByMphCode(@PathVariable("mphCode") String mphCode) {
		List<Object[]> mphCodeAndMphNameByMphCode = savePolicyFullSurrenderPolicySurrenderService.findMphCodeAndMphNameByMphCode(mphCode);
		return new ResponseEntity<>(mphCodeAndMphNameByMphCode, HttpStatus.OK);
	}

}