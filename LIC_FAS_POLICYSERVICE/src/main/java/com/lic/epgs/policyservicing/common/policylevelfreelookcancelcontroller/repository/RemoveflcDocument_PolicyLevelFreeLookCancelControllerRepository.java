import org.springframework.data.jpa.repository.JpaRepository;

public interface RemoveflcDocument_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<freeLookCancellationDocumentDto, String> {
 
    public freeLookCancellationDocumentDto removeFLCDocument(String documentId, String freeLookId, String modifiedBy);

    public TransactionStatus removeFlcDocumentStatus(String documentId, String freeLookId);
}