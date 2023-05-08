package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.Address;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.RemoveAddressService;

@RestController
public class RemoveAddressController {

    @Autowired
    private RemoveAddressService removeAddressService;
    
    @DeleteMapping(value = "/remove-address/{addressId}/{memberId}")
    public int removeAddress(@PathVariable Long addressId, @PathVariable Long memberId) {
        return removeAddressService.removeAddress(addressId, memberId);
    }
    
    @GetMapping(value = "/all-active-address/{memberId}")
    public List<Address> findAllActiveAddressesByMemberId(@PathVariable Long memberId) {
        return removeAddressService.findAllActiveAddressesByMemberId(memberId);
    }
    
    @GetMapping(value = "/address/{addressId}/{memberId}")
    public Address findAddressByIdAndMemberId(@PathVariable Long addressId, @PathVariable Long memberId) {
        return removeAddressService.findAddressByIdAndMemberId(addressId, memberId);
    }
}