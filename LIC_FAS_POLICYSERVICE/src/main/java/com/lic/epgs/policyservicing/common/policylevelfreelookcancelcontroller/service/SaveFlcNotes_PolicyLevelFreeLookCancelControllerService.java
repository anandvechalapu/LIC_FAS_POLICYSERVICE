@Service
public class SaveFlcNotes_PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private SaveFlcNotes_PolicyLevelFreeLookCancelControllerRepository saveFlcNotes_PolicyLevelFreeLookCancelControllerRepository;

    public FreeLookCancellationResponseDto saveFlcNotes(Long freeLookId, Long policyId, Long serviceId, String notesText) {
        return saveFlcNotes_PolicyLevelFreeLookCancelControllerRepository.saveFlcNotes(freeLookId, policyId, serviceId, notesText);
    }
}