@Service
public class GetAllExistingCommissionService {

    @Autowired
    GetAllExistingCommissionRepository getAllExistingCommissionRepository;

    public ResponseEntity<CommissionDto> getAllExistingCommission(Integer commissionId){
        return getAllExistingCommissionRepository.getAllExistingCommission(commissionId);
    }

    public ResponseEntity<String> getErrorMessageWithStatusCode400(){
        return getAllExistingCommissionRepository.getErrorMessageWithStatusCode400();
    }

    public ResponseEntity<String> getErrorMessageWithStatusCode404(){
        return getAllExistingCommissionRepository.getErrorMessageWithStatusCode404();
    }

}