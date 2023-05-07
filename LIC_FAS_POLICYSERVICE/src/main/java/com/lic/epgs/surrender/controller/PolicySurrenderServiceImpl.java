Service

@Service
public class PolicySurrenderServiceImpl implements PolicySurrenderService {
    private final PolicySurrenderTempRepository policySurrenderTempRepository;
    
    @Autowired
    public PolicySurrenderServiceImpl(PolicySurrenderTempRepository policySurrenderTempRepository) {
        this.policySurrenderTempRepository = policySurrenderTempRepository;
    }
    
    @Override
    public PolicySurrenderApiResponse getSurrenderDetails(String policyNo) {
        // Implementation
    }
    
    @Override
    public PolicySurrenderApiResponse saveSurrenderDetails(PolicySurrenderDto surrenderDto) {
        // Implementation
    }
    
}

Spring Boot Controller Class

@RestController
@RequestMapping("/surrender")
public class PolicySurrenderController {
    
    private final PolicySurrenderService policySurrenderService;
    
    @Autowired
    public PolicySurrenderController(PolicySurrenderService policySurrenderService) {
        this.policySurrenderService = policySurrenderService;
    }
    
    @GetMapping("/details/{policyNo}")
    public PolicySurrenderApiResponse getSurrenderDetails(@PathVariable("policyNo") String policyNo) {
        return policySurrenderService.getSurrenderDetails(policyNo);
    }
    
    @PostMapping("/details")
    public PolicySurrenderApiResponse saveSurrenderDetails(@RequestBody PolicySurrenderDto surrenderDto) {
        return policySurrenderService.saveSurrenderDetails(surrenderDto);
    }
    
}