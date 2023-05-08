@Service
public class GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerServiceImpl implements GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerService {

    private final GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerRepository repository;

    public GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerServiceImpl(
            GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerRepository repository
    ) {
        this.repository = repository;
    }

    @Override
    public FreeLookCancellationResponseDto getExistingFreeLookCancellationById(Long freeLookId) {
        return repository.getExistingFreeLookCancellationById(freeLookId);
    }
    
    @Override
    public FreeLookCancellationResponseDto getFreeLookCancellationById(Long freeLookId) {
        return repository.getFreeLookCancellationById(freeLookId);
    }
    
    @Override
    public boolean existsByFreeLookId(Long freeLookId) {
        return repository.existsByFreeLookId(freeLookId);
    }
    
    @Override
    public FreeLookCancellation findByFreeLookId(Long freeLookId) {
        return repository.findByFreeLookId(freeLookId);
    }
    
    @Override
    public FreeLookCancellation findByPolicyNumber(String policyNumber) {
        return repository.findByPolicyNumber(policyNumber);
    }
    
    @Override
    public FreeLookCancellation findByStatus(String status) {
        return repository.findByStatus(status);
    }
    
    @Override
    public List<FreeLookCancellation> findAll() {
        return repository.findAll();
    }
    
    @Override
    public void deleteByFreeLookId(Long freeLookId) {
        repository.deleteByFreeLookId(freeLookId);
    }
}