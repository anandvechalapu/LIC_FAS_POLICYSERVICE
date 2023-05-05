package com.lic.epgs.fund.policyinterestratefundcontroller.service;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.AccountingIntegrationRequestDto;
import com.lic.epgs.fund.policyinterestratefundcontroller.model.SuperAnnuationResponseModel;
import com.lic.epgs.fund.policyinterestratefundcontroller.repository.GetMphAndIcodeDetail_PolicyInterestRateFundController7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetMphAndIcodeDetail_PolicyInterestRateFundController7Service {

    @Autowired
    private GetMphAndIcodeDetail_PolicyInterestRateFundController7Repository getMphAndIcodeDetail_PolicyInterestRateFundController7Repository;

    /**
     * Gets SuperAnnuation response containing various fields such as scheme name, customer name, customer code, MPH mobile number, MPH email, MPH address, MPH name, MPH number, servicing unit details, and iCodes for different fields.
     *
     * @param requestDto The request body of AccountingIntegrationRequestDto
     * @return A ResponseEntity<Object> with an HTTP status code of 200 OK and a response body containing a SuperAnnuationResponseModel object
     */
    public ResponseEntity<Object> getSuperAnnuationResponse(AccountingIntegrationRequestDto requestDto) {
        return getMphAndIcodeDetail_PolicyInterestRateFundController7Repository.getSuperAnnuationResponse(requestDto);
    }

}