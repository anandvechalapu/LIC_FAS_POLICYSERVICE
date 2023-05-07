The test class PolicySurrenderServiceImplTest has the new test method testGetSurrenderNotesList that tests the business logic for the new API endpoint.The test method testGetSurrenderNotesList verifies that the API returns a JSON response with a status code of 200 (OK) when notes related to the provided surrender ID are found.The test method testGetSurrenderNotesList verifies that the response contains a list of commonNotesDto objects which represent the notes related to the provided surrender ID.The test method testGetSurrenderNotesList verifies that the API returns a JSON response with a status code of 400 (Bad Request) when the mandatory surrenderId parameter is missing or invalid.The test method testGetSurrenderNotesList verifies that the API returns a JSON response with a status code of 404 (Not Found) when no notes related to the provided surrender ID are found.

package com.lic.epgs.surrender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.surrender.model.CommonNoteTempEntity;

@Repository
public interface SurrenderNotesListRepository extends JpaRepository<CommonNoteTempEntity, Long> {
    
    CommonNoteTempEntity findBySurrenderId(Long surrenderId);
    
    void deleteBySurrenderId(Long surrenderId);
    
}