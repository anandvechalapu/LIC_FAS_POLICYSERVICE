package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.PolicyServiceDocumentDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.PolicyServiceDocumentTempEntity;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.PolicyServiceDocumentTempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private PolicyServiceDocumentTempRepository policyServiceDocumentTempRepository;

    public FreeLookCancellationResponseDto uploadDocument(PolicyServiceDocumentDto policyServiceDocumentDto) {
        FreeLookCancellationResponseDto freeLookCancellationResponseDto = new FreeLookCancellationResponseDto();
        try {
            PolicyServiceDocumentTempEntity policyServiceDocumentTempEntity = mapToPolicyServiceDocumentTempEntity(policyServiceDocumentDto);
            policyServiceDocumentTempRepository.save(policyServiceDocumentTempEntity);
            freeLookCancellationResponseDto.setTransactionStatus("SUCCESS");
            freeLookCancellationResponseDto.setMessage("SAVED");
        } catch (Exception e) {
            freeLookCancellationResponseDto.setTransactionStatus("ERROR");
            freeLookCancellationResponseDto.setMessage("FAIL");
        }
        return freeLookCancellationResponseDto;
    }

    private PolicyServiceDocumentTempEntity mapToPolicyServiceDocumentTempEntity(PolicyServiceDocumentDto policyServiceDocumentDto) {
        PolicyServiceDocumentTempEntity policyServiceDocumentTempEntity = new PolicyServiceDocumentTempEntity();
        policyServiceDocumentTempEntity.setDocumentName(policyServiceDocumentDto.getDocumentName());
        policyServiceDocumentTempEntity.setDocumentContent(policyServiceDocumentDto.getDocumentContent());
        policyServiceDocumentTempEntity.setDocumentType(policyServiceDocumentDto.getDocumentType());
        return policyServiceDocumentTempEntity;
    }

}