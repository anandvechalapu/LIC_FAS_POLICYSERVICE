@Repository
public interface PolicyLevelConversionCheckerControllerRepository extends JpaRepository<PolicyLevelConversionTempEntity, Long> {

    @Query("UPDATE PolicyLevelConversionTempEntity SET conversionStatus= 'Active' WHERE conversionId = :conversionId")
    void updateConversionStatus(@Param("conversionId") Long conversionId);

    @Query("UPDATE PolicyLevelConversionTempEntity SET conversionWorkflowStatus= 'Approved', modifiedBy = :modifiedBy, modifiedOn = CURRENT_DATE WHERE conversionId = :conversionId")
    void updateConversionWorkflowStatus(@Param("conversionId") Long conversionId, @Param("modifiedBy") String modifiedBy);

    @Query("SELECT p FROM PolicyLevelConversionTempEntity p WHERE prevPolicyId = :prevPolicyId")
    PolicyLevelConversionEntity checkIfExists(@Param("prevPolicyId") Long prevPolicyId);

    @Query("INSERT INTO PolicyLevelConversionEntity (field1, field2, ..., fieldN) SELECT field1, field2, ..., fieldN FROM PolicyLevelConversionTempEntity WHERE conversionId = :conversionId")
    void saveNewPolicyLevelConversionEntity(@Param("conversionId") Long conversionId);

    @Query("INSERT INTO PolicyServiceDocumentEntity (field1, field2, ..., fieldN) SELECT field1, field2, ..., fieldN FROM PolicyServiceDocumentTempEntity WHERE conversionId = :conversionId")
    void saveNewPolicyServiceDocumentEntity(@Param("conversionId") Long conversionId);

    @Query("INSERT INTO PolicyServiceNotesEntity (field1, field2, ..., fieldN) SELECT field1, field2, ..., fieldN FROM PolicyServiceNotesTempEntity WHERE serviceId = :serviceId")
    void saveNewPolicyServiceNotesEntity(@Param("serviceId") Long serviceId);

}