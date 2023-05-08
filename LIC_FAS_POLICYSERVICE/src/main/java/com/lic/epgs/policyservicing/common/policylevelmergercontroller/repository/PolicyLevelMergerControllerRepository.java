@Repository
public interface PolicyLevelMergerControllerRepository {
 
    /**
     * Get Document List for the given merge ID
     *
     * @param mergeId
     * @return ResponseEntity containing a list of PolicyServiceDocumentDto objects associated with the given merge ID
     */
    ResponseEntity<List<PolicyServiceDocumentDto>> getDocumentList(String mergeId);
 
}