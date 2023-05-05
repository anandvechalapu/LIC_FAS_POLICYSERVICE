package com.lic.epgs.policyservicing.common.memberlvl.repository;

import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutReqDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.entity.TransferInAndOutTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferInAndOutTempRepository  extends JpaRepository<TransferInAndOutTempEntity, Long> {

    /**
     * Method to send transfer requests to the maker
     *
     * @param transferReqDto - TransferInAndOutReqDto object containing non-null values for unitCode and transferId
     * @return TransferInAndOutResponseDto - object with transaction status and message 
     */
    TransferInAndOutResponseDto sendToMaker(TransferInAndOutReqDto transferReqDto);

}