@Repository
public interface SaveFlcNotes_PolicyLevelFreeLookCancelControllerRepository {

    FreeLookCancellationResponseDto saveFlcNotes(Long freeLookId, Long policyId, Long serviceId, String notesText);

}