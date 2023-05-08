@Repository
public interface RemoveDocumentPolicyLevelMergerControllerRepository {

    PolicyLevelMergerApiResponse removeDocument(Long documentId, Long mergeId);

}