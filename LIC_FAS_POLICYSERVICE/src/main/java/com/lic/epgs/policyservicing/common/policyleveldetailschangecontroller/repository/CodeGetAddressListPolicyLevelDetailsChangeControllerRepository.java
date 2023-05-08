package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.Address;

public interface CodeGetAddressListPolicyLevelDetailsChangeControllerRepository extends JpaRepository<Address, Long> {

	@Query("SELECT a FROM Address a WHERE a.mphId = :mphId")
	public Address getAddressList(String mphId);

}