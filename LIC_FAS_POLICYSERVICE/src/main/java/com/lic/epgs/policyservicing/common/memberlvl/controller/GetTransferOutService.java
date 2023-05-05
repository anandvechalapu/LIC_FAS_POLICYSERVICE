@Service
public class GetTransferOutService {

    private final Logger logger = LoggerFactory.getLogger(GetTransferOutService.class);

    @Autowired
    private GetTransferOutRepository getTransferOutRepository;

    public TransferOutResponseDto getTransferOut(String role, String unitCode) {
        TransferOutResponseDto responseDto = new TransferOutResponseDto();
        try {
            if(role == null || role.isBlank() || unitCode == null || unitCode.isBlank()) {
                return responseDto;
            }
            logger.info("Starting getTransferOut with role: {}, unitCode: {}", role, unitCode);
            responseDto = getTransferOutRepository.getTransferOut(role, unitCode);
            logger.info("Ending getTransferOut with role: {}, unitCode: {}", role, unitCode);
        } catch(Exception e) {
            logger.error("Exception while executing getTransferOut with role: {}, unitCode: {}", role, unitCode, e);
            responseDto.setTransactionMessage(e.getMessage());
            responseDto.setTransactionStatus("Fail");
        }
        return responseDto;
    }
}

package com.lic.epgs.policyservicing.common.memberlvl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.Transfer;
import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.GetInprogressLoadService;
import com.lic.epgs.policyservicing.common.memberlvl.service.GetTransferOutService;

@RestController
@RequestMapping("/member")
public class TransferController {
    
    private final Logger logger = LoggerFactory.getLogger(TransferController.class);

    @Autowired
    private GetInprogressLoadService getInprogressLoadService;

    @Autowired
    private GetTransferOutService getTransferOutService;

    @GetMapping("/transferInAndOut")
    public TransferInAndOutResponseDto getInprogressLoad(@RequestParam("role") String role, @RequestParam("unitCode") String unitCode) {
        return getInprogressLoadService.getInprogressLoad(role, unitCode);
    }

    @GetMapping("/transferOut")
    public TransferOutResponseDto getTransferOut(@RequestParam("role") String role, @RequestParam("unitCode") String unitCode) {
        return getTransferOutService.getTransferOut(role, unitCode);
    }
}