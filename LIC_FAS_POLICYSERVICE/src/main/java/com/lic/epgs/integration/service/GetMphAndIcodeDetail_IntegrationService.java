package com.lic.epgs.integration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.integration.model.AccountingIntegrationRequestDto;
import com.lic.epgs.integration.repository.GetMphAndIcodeDetail_IntegrationRepository;

@Service
public class GetMphAndIcodeDetail_IntegrationService {
	
 @Autowired
 private GetMphAndIcodeDetail_IntegrationRepository getMphAndIcodeDetail_IntegrationRepository;
 
 public Optional<AccountingIntegrationRequestDto> getMphAndIcodeDetail(Long id) {
  return getMphAndIcodeDetail_IntegrationRepository.getMphAndIcodeDetail(id);
 }

}