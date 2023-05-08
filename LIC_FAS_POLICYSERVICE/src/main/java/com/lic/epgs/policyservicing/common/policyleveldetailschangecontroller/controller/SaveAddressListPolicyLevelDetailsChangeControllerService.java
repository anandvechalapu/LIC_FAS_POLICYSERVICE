package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.Address;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.SaveAddressListPolicyLevelDetailsChangeControllerRepository;

@Service
public class SaveAddressListPolicyLevelDetailsChangeControllerService {

	@Autowired
	SaveAddressListPolicyLevelDetailsChangeControllerRepository saveAddressListRepository;

	public Address saveAddressList(Address address) {
		return saveAddressListRepository.save(address);
	}

}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.Address;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.CodeGetAddressListPolicyLevelDetailsChangeControllerService;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.SaveAddressListPolicyLevelDetailsChangeControllerService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	CodeGetAddressListPolicyLevelDetailsChangeControllerService addressListService;
	
	@Autowired
	SaveAddressListPolicyLevelDetailsChangeControllerService saveAddressListService;
	
	@GetMapping("/mphId/{mphId}")
	public Address getAddressList(@PathVariable("mphId") String mphId) {
		return addressListService.getAddressList(mphId);
	}
	
	@GetMapping("/all")
	public List<Address> getAllAddressList() {
		return addressListService.getAllAddressList();
	}
	
	@PostMapping("/save")
	public Address saveAddressList(@RequestBody Address address) {
		return saveAddressListService.saveAddressList(address);
	}
	
}