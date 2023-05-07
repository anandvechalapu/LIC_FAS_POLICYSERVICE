Controller

@RestController
@RequestMapping("/getPolicySurrenderBasicDetailsById")
public class PolicySurrenderController {
    @Autowired
    private PolicySurrenderService policySurrenderService;
    
    @GetMapping
    public PolicySurrenderApiResponse getPolicySurrenderBasicDetailsById(@RequestParam Long surrenderId) {
        return policySurrenderService.getPolicySurrenderBasicDetailsById(surrenderId);
    }
}

Service

@Service
public class PolicySurrenderService {
    @Autowired
    private PolicySurrenderRepository policySurrenderRepository;
    
    @Autowired
    private ModelMapper modelMapper;
    
    public PolicySurrenderApiResponse getPolicySurrenderBasicDetailsById(Long surrenderId) {
        PolicySurrenderApiResponse response = new PolicySurrenderApiResponse();
        try {
            PolicySurrenderTempEntity entity = policySurrenderRepository.findById(surrenderId).orElseThrow(() -> new NotFoundException("Policy surrender not found with id: " + surrenderId));
            PolicySurrenderDto dto = modelMapper.map(entity, PolicySurrenderDto.class);
            response.setSurrenderDto(dto);
            response.setTransactionStatus(TransactionStatus.SUCCESS);
            response.setTransactionMessage(TransactionMessage.FETCH_MESSAGE);
        } catch (Exception e) {
            response.setTransactionStatus(TransactionStatus.FAIL);
            response.setTransactionMessage(e.getMessage());
        }
        return response;
    }
}

Repository

@Repository
public interface PolicySurrenderRepository extends JpaRepository<PolicySurrenderTempEntity, Long> {

}