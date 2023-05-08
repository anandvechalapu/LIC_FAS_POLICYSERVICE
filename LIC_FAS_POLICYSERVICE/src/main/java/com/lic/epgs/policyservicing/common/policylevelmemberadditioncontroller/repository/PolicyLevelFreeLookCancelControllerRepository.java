package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyServiceMemberAdditionDto;

public interface PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<PolicyServiceMemberAdditionDto, Long>, JpaSpecificationExecutor<PolicyServiceMemberAdditionDto> {
 
    //Method to search Policy Service Member Addition records based on MPH name
    List<PolicyServiceMemberAdditionDto> findByMphNameIgnoreCase(String mphName);

    //Method to search Policy Service Member Addition records based on MPH code
    List<PolicyServiceMemberAdditionDto> findByMphCode(String mphCode);

    //Method to search Policy Service Member Addition records based on product
    List<PolicyServiceMemberAdditionDto> findByProduct(String product);

    //Method to search Policy Service Member Addition records based on line of business
    List<PolicyServiceMemberAdditionDto> findByLineOfBusiness(String lineOfBusiness);

    //Method to search Policy Service Member Addition records based on member addition status
    List<PolicyServiceMemberAdditionDto> findByMemberAdditionStatus(String memberAdditionStatus);

    //Method to search Policy Service Member Addition records based on unit code
    List<PolicyServiceMemberAdditionDto> findByUnitCode(String unitCode);

    //Method to search Policy Service Member Addition records based on service number
    List<PolicyServiceMemberAdditionDto> findByServiceNumber(String serviceNumber);

    //Method to search Policy Service Member Addition records based on page name
    List<PolicyServiceMemberAdditionDto> findByPageName(String pageName);

    //Method to search Policy Service Member Addition records based on active status
    List<PolicyServiceMemberAdditionDto> findByActiveStatus(Boolean activeStatus);

    //Method to search Policy Service Member Addition records based on multiple criteria
    List<PolicyServiceMemberAdditionDto> findByMphNameIgnoreCaseAndMphCodeAndProductAndLineOfBusinessAndMemberAdditionStatusAndUnitCodeAndServiceNumberAndPageNameAndActiveStatus(String mphName, String mphCode, String product, String lineOfBusiness, String memberAdditionStatus, String unitCode, String serviceNumber, String pageName, Boolean activeStatus);

}