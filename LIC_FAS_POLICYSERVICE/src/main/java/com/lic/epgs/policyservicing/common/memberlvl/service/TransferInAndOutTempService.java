package com.lic.epgs.policyservicing.common.memberlvl.service;

import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutReqDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.entity.TransferInAndOutTempEntity;
import com.lic.epgs.policyservicing.common.memberlvl.repository.TransferInAndOutTempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferInAndOutTempService {

    @Autowired
    private TransferInAndOutTempRepository transferInAndOutTempRepository;

    /**
     * Method to send transfer requests to the maker
     *
     * @param transferReqDto - TransferInAndOutReqDto object containing non-null values for unitCode and transferId
     * @return TransferInAndOutResponseDto - object with transaction status and message
     */
    public TransferInAndOutResponseDto sendToMaker(TransferInAndOutReqDto transferReqDto) {
        TransferInAndOutResponseDto transferInAndOutResponseDto = new TransferInAndOutResponseDto();
        TransferInAndOutTempEntity transferInAndOutTempEntity = createTransferInAndOutTempEntity(transferReqDto);

        if (transferInAndOutTempRepository.saveAndFlush(transferInAndOutTempEntity) != null) {
            transferInAndOutResponseDto.setStatus("SUCCESS");
            transferInAndOutResponseDto.setMessage("Transfer request successfully sent to maker.");
        } else {
            transferInAndOutResponseDto.setStatus("FAILURE");
            transferInAndOutResponseDto.setMessage("Unable to send transfer request to maker. Please try again.");
        }
        return transferInAndOutResponseDto;
    }

    /**
     * Method to create TransferInAndOutTempEntity object
     *
     * @param transferReqDto - TransferInAndOutReqDto object containing non-null values for unitCode and transferId
     * @return TransferInAndOutTempEntity - object populated with the values in transferReqDto
     */
    private TransferInAndOutTempEntity createTransferInAndOutTempEntity(TransferInAndOutReqDto transferReqDto) {
        TransferInAndOutTempEntity transferInAndOutTempEntity = new TransferInAndOutTempEntity();
        transferInAndOutTempEntity.setUnitCode(transferReqDto.getUnitCode());
        transferInAndOutTempEntity.setTransferId(transferReqDto.getTransferId());
        return transferInAndOutTempEntity;
    }
}