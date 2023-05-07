package com.lic.epgs.surrender.service;

import com.lic.epgs.dto.MphBankDto;
import com.lic.epgs.dto.PolicySurrenderApiResponse;
import com.lic.epgs.model.MphBankTemp;
import com.lic.epgs.model.MphMaster;
import com.lic.epgs.model.MphMasterTemp;
import com.lic.epgs.surrender.repository.UpdatePolicyBankDetailsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdatePolicyBankDetailsService {

    @Autowired
    private UpdatePolicyBankDetailsRepository updatePolicyBankDetailsRepository;

    public PolicySurrenderApiResponse updatePolicyBankDetails(MphBankDto mphBankDto) {
        return updatePolicyBankDetailsRepository.updatePolicyBankDetails(mphBankDto);
    }
}