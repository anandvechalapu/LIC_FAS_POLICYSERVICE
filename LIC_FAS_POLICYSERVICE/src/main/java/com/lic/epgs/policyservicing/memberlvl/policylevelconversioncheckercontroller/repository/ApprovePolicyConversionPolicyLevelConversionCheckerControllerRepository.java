@Repository
public interface ApprovePolicyConversionPolicyLevelConversionCheckerControllerRepository  {

  // Method to approve policy conversion
  public ResponseEntity<Object> approvePolicyConversion(long conversionId, String modifiedBy);

  // Method to get PolicyLevelConversionTempEntity with the provided conversionId
  public PolicyLevelConversionTempEntity getPolicyLevelConversionTempEntity(long conversionId);

  // Method to update the conversion status of the PolicyLevelConversionTempEntity
  public void updatePolicyLevelConversionTempEntityStatus(long conversionId);

  // Method to update the conversion workflow status of the PolicyLevelConversionTempEntity
  public void updatePolicyLevelConversionTempEntityWorkflowStatus(long conversionId);

  // Method to update the modifiedBy field of the PolicyLevelConversionTempEntity
  public void updatePolicyLevelConversionTempEntityModifiedBy(long conversionId, String modifiedBy);

  // Method to update the modifiedOn field of the PolicyLevelConversionTempEntity
  public void updatePolicyLevelConversionTempEntityModifiedOn(long conversionId);

  // Method to create a new PolicyLevelConversionEntity
  public void createPolicyLevelConversionEntity(long prevPolicyId);

  // Method to set values of the fields in the new PolicyLevelConversionEntity
  public void setPolicyLevelConversionEntityFields(long conversionId);

  // Method to copy PolicyServiceDocumentTempEntity to PolicyServiceDocumentEntity
  public void copyPolicyServiceDocumentTempEntity(long conversionId);

  // Method to set conversionId of the PolicyServiceDocumentEntity
  public void setPolicyServiceDocumentEntityConversionId(long conversionId);

  // Method to copy PolicyServiceNotesTempEntity to PolicyServiceNotesEntity
  public void copyPolicyServiceNotesTempEntity(long serviceId);

  // Method to set serviceId of the PolicyServiceNotesEntity
  public void setPolicyServiceNotesEntityServiceId(long serviceId);

}