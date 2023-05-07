package com.lic.epgs.surrender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.surrender.model.PolicySurrenderApiResponse;

public interface GetSurrenderDocumentDetailsRepository extends JpaRepository<PolicySurrenderApiResponse, Long> {

    PolicySurrenderApiResponse findBySurrenderId(Long surrenderId);

}