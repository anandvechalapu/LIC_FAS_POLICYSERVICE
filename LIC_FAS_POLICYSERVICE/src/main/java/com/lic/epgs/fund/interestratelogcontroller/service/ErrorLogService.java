package com.lic.epgs.fund.interestratelogcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.fund.interestratelogcontroller.model.ErrorLog;
import com.lic.epgs.fund.interestratelogcontroller.repository.ErrorLogRepository;

@Service
public class ErrorLogService {

	@Autowired
	private ErrorLogRepository errorLogRepository;
	
	public ErrorLog findByRefNumber(String refNumber) {
		return errorLogRepository.findByRefNumber(refNumber);
	}
	
	public void deleteByRefNumber(String refNumber) {
		errorLogRepository.deleteByRefNumber(refNumber);
	}
}