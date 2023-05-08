@Service
@Transactional
public class PolicyLevelFreeLookCancelControllerServiceImpl implements PolicyLevelFreeLookCancelControllerService {
    
    @Autowired
    private PolicyLevelFreeLookCancelControllerRepository policyLevelFreeLookCancelControllerRepository;

    @Override
    public FreeLookCancellationResponseDto getFreeLookCancellationDetails(Long freeLookCancellationId) {
        FreeLookCancellationTempEntity freeLookCancellationTempEntity = policyLevelFreeLookCancelControllerRepository.getFreeLookCancellationDetails(freeLookCancellationId);
        FreeLookCancellationResponseDto freeLookCancellationResponseDto = new FreeLookCancellationResponseDto();
        BeanUtils.copyProperties(freeLookCancellationTempEntity, freeLookCancellationResponseDto);
        return freeLookCancellationResponseDto;
    }

}