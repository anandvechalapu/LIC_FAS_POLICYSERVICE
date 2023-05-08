@Service
public class RemoveAppointeePolicyLevelFreeLookCancelControllerService {

    @Autowired
    private RemoveAppointeePolicyLevelFreeLookCancelControllerRepository removeAppointeePolicyLevelFreeLookCancelControllerRepository;

    public int removeAppointee(Long memberId, Long appointeeId) {
        return removeAppointeePolicyLevelFreeLookCancelControllerRepository.removeAppointee(memberId, appointeeId);
    }
    
    public List<PolicyServiceMbrApponinteeDto> getActiveAppointeesByMemberId(Long memberId) {
        return removeAppointeePolicyLevelFreeLookCancelControllerRepository.getActiveAppointeesByMemberId(memberId);
    }
}