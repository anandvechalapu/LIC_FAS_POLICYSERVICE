package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.PolicyServiceNotes;

@Repository
public interface PolicyServiceNotesRepository extends JpaRepository<PolicyServiceNotes, Long> {

    /**
     * Retrieves a list of policy service notes by providing a service ID.
     *
     * @param serviceId The service ID to retrieve the policy service notes for.
     * @return A list of policy service notes.
     */
    List<PolicyServiceNotes> getNotesDetailsList_PolicyLevelConversionController(Long serviceId);

}