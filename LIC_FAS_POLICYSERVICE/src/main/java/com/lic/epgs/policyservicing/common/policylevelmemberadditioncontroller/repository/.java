package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class PolicyLevelFreeLookCancelControllerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public CommonResponseDto criteriaSearch(PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<PolicyServiceMemberAdditionDto> criteriaQuery = cb.createQuery(PolicyServiceMemberAdditionDto.class);

        // Construct the search query using the CriteriaBuilder and CriteriaQuery classes
        // Search should use case-insensitive matching for MPH name
        // Search should return only the active records
        // Search should return only the records that match all the provided criteria
        // Search should return the MPH name, MPH code, product, line of business, member addition status, unit code, and service number fields

        List<PolicyServiceMemberAdditionDto> results = entityManager.createQuery(criteriaQuery).getResultList();

        CommonResponseDto response = new CommonResponseDto();
        response.setData(results);
        response.setTransactionMessage("Search successful");
        response.setTransactionStatus("SUCCESS");

        return response;
    }
}