package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository; 

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.CommonResponseDto;

public interface PolicyLevelMemberAdditionControllerRepository {
    
    /**
    * Saves a note related to a Policy Service Member.
    *
    * @param memberAdditionId - A unique identifier for the member addition.
    * @param note - A string containing the text of the note.
    * @param createdBy - A string containing the username of the user who created the note.
    * @param createdOn - A date and time indicating when the note was created.
    *
    * @return A CommonResponseDto with a SUCCESS status and an empty response data if the note was saved successfully.
    *         A CommonResponseDto with a FAIL status and a transaction message indicating that the memberAdditionId
    *         is invalid if the memberAdditionId is not associated with a Policy Service Member.
    */
    CommonResponseDto saveNote(String memberAdditionId, String note, String createdBy, Date createdOn);
}