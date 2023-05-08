@Repository
public interface PolicyLevelMergerControllerRepository {
   
    /**
     * Get a list of policy documents for a given merge ID.
     *
     * @param mergeId The ID of the policy merge.
     * @return A list of PolicyServiceDocumentDto objects, or an empty list if no documents are found.
     */
    List<PolicyServiceDocumentDto> getDocumentList(Long mergeId);
}