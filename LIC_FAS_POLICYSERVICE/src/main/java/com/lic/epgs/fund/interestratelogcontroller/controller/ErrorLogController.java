package com.lic.epgs.fund.interestratelogcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.interestratelogcontroller.model.ErrorLog;
import com.lic.epgs.fund.interestratelogcontroller.service.ErrorLogService;

@RestController
@RequestMapping("/errorlog")
public class ErrorLogController {
	
	@Autowired
	private ErrorLogService errorLogService;
	
	@GetMapping("/{refNumber}")
	public ErrorLog getErrorLogByReferenceNumber(@PathVariable String refNumber) {
		return errorLogService.findByRefNumber(refNumber);
	}
	
	@DeleteMapping("/{refNumber}")
	public void deleteErrorLogByReferenceNumber(@PathVariable String refNumber) {
		errorLogService.deleteByRefNumber(refNumber);
	}

}