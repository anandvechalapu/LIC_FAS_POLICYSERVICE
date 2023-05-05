package com.lic.epgs.fund.interestratelogcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.fund.interestratelogcontroller.model.FailedErrorLog;
import com.lic.epgs.fund.interestratelogcontroller.repository.FailedErrorLogRepository;

@Service
public class FailedErrorLogService {

	@Autowired
	private FailedErrorLogRepository failedErrorLogRepository;
	
	// Method to get all failed error logs ordered by ID in ascending order
	public List<FailedErrorLog> getAllFailedErrorLogs(){
		return failedErrorLogRepository.findAllByOrderByIdAsc();
	}
}