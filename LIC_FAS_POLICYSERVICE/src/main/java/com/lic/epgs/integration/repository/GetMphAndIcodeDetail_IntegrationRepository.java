package com.lic.epgs.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.integration.model.AccountingIntegrationRequestDto;

@Repository
public interface GetMphAndIcodeDetail_IntegrationRepository extends JpaRepository<AccountingIntegrationRequestDto, Long> {

    @Query("SELECT a.schemeName, a.mphCode, a.mphName, a.mphNo, a.mphMobileNo, a.mphEmail, a.mphAddress1, a.mphAddress2, a.district, a.state, a.pinCode, a.servicingUnitName, a.servicingUnitAddress1, a.servicingUnitAddress2, a.servicingUnitAddress3, a.servicingUnitAddress4, a.servicingUnitCity, a.servicingUnitPincode, a.servicingUnitEmail, a.servicingUnitPhoneNo, a.operatingUnitType, a.unitCode, a.ICodeForLob, a.ICodeForProductLine, a.ICodeForVariant, a.ICodeForBusinessType, a.ICodeForParticipatingType, a.ICodeForBusinessSegment, a.ICodeForInvestmentPortfolio FROM AccountingIntegrationRequestDto a WHERE a.id=?1")
    AccountingIntegrationRequestDto getMphAndIcodeDetail(Long id);
}