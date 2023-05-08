package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository; 

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.Address;

public interface RemoveAddressRepository extends JpaRepository<Address, Long> {
 
    @Transactional
    @Modifying
    @Query("UPDATE Address a SET a.active = false WHERE a.id = ?1 AND a.memberId = ?2")
    int removeAddress(Long addressId, Long memberId);
    
    @Query("SELECT a FROM Address a WHERE a.memberId = ?1 AND a.active = true")
    List<Address> findAllActiveAddressesByMemberId(Long memberId);
    
    @Query("SELECT a FROM Address a WHERE a.id = ?1 AND a.memberId = ?2")
    Address findAddressByIdAndMemberId(Long addressId, Long memberId);
}