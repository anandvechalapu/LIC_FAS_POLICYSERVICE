package com.lic.epgs.fund.interestratelogcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.fund.interestratelogcontroller.model.FailedErrorLog;

public interface FailedErrorLogRepository extends JpaRepository<FailedErrorLog, Long> {
	
	List<FailedErrorLog> findAllByOrderByIdAsc();

}

package com.lic.epgs.fund.interestratelogcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.interestratelogcontroller.model.FailedErrorLog;
import com.lic.epgs.fund.interestratelogcontroller.service.FailedErrorLogService;

@RestController
public class FailedErrorLogController {
	
	@Autowired
	private FailedErrorLogService failedErrorLogService;
	
	@GetMapping("/failedErrorLogs")
	public List<FailedErrorLog> getAllFailedErrorLogs() {
		return failedErrorLogService.getAllFailedErrorLogs();
	}

}