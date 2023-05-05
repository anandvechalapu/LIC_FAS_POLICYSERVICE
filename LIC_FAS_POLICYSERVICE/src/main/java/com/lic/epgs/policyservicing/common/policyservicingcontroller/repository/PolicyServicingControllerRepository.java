@Repository
public interface PolicyServicingControllerRepository {

    /**
     * Saves a PolicyServiceDocumentDto object.
     *
     * @param policyServiceDocumentDto The PolicyServiceDocumentDto object to be saved.
     * @return A CommonResponseDto containing the result of the save operation.
     */
    CommonResponseDto savePolicyServiceDocument(PolicyServiceDocumentDto policyServiceDocumentDto);
}