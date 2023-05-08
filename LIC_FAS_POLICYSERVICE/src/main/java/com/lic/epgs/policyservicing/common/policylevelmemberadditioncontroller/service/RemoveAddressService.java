package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.Address;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.RemoveAddressRepository;

@Service
public class RemoveAddressService {

    @Autowired
    private RemoveAddressRepository removeAddressRepository;
    
    public int removeAddress(Long addressId, Long memberId) {
        return removeAddressRepository.removeAddress(addressId, memberId);
    }
    
    public List<Address> findAllActiveAddressesByMemberId(Long memberId) {
        return removeAddressRepository.findAllActiveAddressesByMemberId(memberId);
    }
    
    public Address findAddressByIdAndMemberId(Long addressId, Long memberId) {
        return removeAddressRepository.findAddressByIdAndMemberId(addressId, memberId);
    }
}