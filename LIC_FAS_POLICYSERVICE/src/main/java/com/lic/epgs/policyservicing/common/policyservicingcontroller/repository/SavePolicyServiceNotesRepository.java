@Repository
public interface SavePolicyServiceNotesRepository {

    /**
     * Method to save policy service notes
     * @param serviceId string representing the service ID
     * @param policyId string representing the policy ID
     * @param serviceType string representing the service type. The value should be either POLSRV_TYPE or OTHER.
     * @param role string representing the role
     * @param page an integer representing the page number
     * @param note string representing the note
     * @return CommonResponseDto containing a set of PolicyServiceNotesDto
     */
    CommonResponseDto savePolicyServiceNotes(String serviceId, String policyId, String serviceType, String role, int page, String note);

}