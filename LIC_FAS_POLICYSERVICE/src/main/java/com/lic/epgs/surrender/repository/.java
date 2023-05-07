package com.lic.epgs.surrender.repository;

import com.lic.epgs.model.MphBankDto;
import com.lic.epgs.model.PolicySurrenderApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolicySurrenderRepository {

    private static final Logger logger = LoggerFactory.getLogger(PolicySurrenderRepository.class);

    @Autowired
    private MphBankRepository mphBankRepository;

    // Repository method to get policy bank details
    public PolicySurrenderApiResponse getPolicyBankDetails(String mphId) {
        logger.info("Fetching policy bank details for mphId: {}", mphId);

        PolicySurrenderApiResponse policySurrenderApiResponse = new PolicySurrenderApiResponse();

        try {
            List<MphBankDto> mphBankDtos = mphBankRepository.getMphBankEntityByMphId(mphId);
            if (mphBankDtos.size() > 0) {
                policySurrenderApiResponse.setPolicyBanks(mphBankDtos);
                policySurrenderApiResponse.setTransactionStatus("SUCCESS");
                policySurrenderApiResponse.setTransactionMessage("FETCH_MESSAGE");
            } else {
                policySurrenderApiResponse.setTransactionStatus("FAIL");
                policySurrenderApiResponse.setTransactionMessage("NO_RECORD_FOUND");
            }
        } catch (IllegalArgumentException e) {
            policySurrenderApiResponse.setTransactionStatus("FAIL");
            policySurrenderApiResponse.setTransactionMessage(e.getMessage());
        }

        logger.info("Finished fetching policy bank details for mphId: {}", mphId);

        return policySurrenderApiResponse;
    }

}