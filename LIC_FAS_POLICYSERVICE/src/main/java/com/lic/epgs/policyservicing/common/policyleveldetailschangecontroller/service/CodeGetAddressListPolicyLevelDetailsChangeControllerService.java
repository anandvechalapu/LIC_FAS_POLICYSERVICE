package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.Address;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.CodeGetAddressListPolicyLevelDetailsChangeControllerRepository;

@Service
public class CodeGetAddressListPolicyLevelDetailsChangeControllerService {

	@Autowired
	CodeGetAddressListPolicyLevelDetailsChangeControllerRepository addressListRepository;

	public Address getAddressList(String mphId) {
		return addressListRepository.getAddressList(mphId);
	}

	public List<Address> getAllAddressList() {
		return addressListRepository.findAll();
	}

}