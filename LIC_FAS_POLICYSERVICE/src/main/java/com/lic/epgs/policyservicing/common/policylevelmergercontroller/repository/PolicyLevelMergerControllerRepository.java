package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import java.util.List;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;
import org.springframework.data.repository.Repository;

public interface PolicyLevelMergerControllerRepository extends Repository<PolicyServiceNotesTempRepository, Long> {

  /**
   * This method retrieves the list of notes associated with a specific merge ID.
   * 
   * @param mergeId the merge ID of the notes to be retrieved.
   * @return a PolicyLevelMergerApiResponse object with a list of PolicyServiceNotesDto objects containing the notes, as well as a transaction status and message.
   */
  PolicyLevelMergerApiResponse getNoteList(long mergeId);

}