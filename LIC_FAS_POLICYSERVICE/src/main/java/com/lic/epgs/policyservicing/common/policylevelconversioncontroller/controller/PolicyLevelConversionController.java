@Repository
public interface PolicyCriteriaSearchPolicyLevelConversionControllerRepository extends 
JpaRepository<PolicyCriteriaSearchPolicyLevelConversionController, Long> {
    
    Optional<PolicyCriteriaSearchPolicyLevelConversionController> findByPolicyNo(String policyNo);
    
}

@RestController
@RequestMapping("/policylevelconversioncontroller")
@Transactional
public class PolicyLevelConversionController {

    private final PolicyCriteriaSearchPolicyLevelConversionControllerService policyCriteriaSearchPolicyLevelConversionControllerService;

    public PolicyLevelConversionController(PolicyCriteriaSearchPolicyLevelConversionControllerService policyCriteriaSearchPolicyLevelConversionControllerService) {
        this.policyCriteriaSearchPolicyLevelConversionControllerService = policyCriteriaSearchPolicyLevelConversionControllerService;
    }

    @GetMapping("/{policyNo}")
    public ResponseEntity<Optional<PolicyCriteriaSearchPolicyLevelConversionController>> findByPolicyNo(@PathVariable String policyNo) {
        Optional<PolicyCriteriaSearchPolicyLevelConversionController> policyCriteriaSearchPolicyLevelConversionController = policyCriteriaSearchPolicyLevelConversionControllerService.findByPolicyNo(policyNo);
        return ResponseEntity.ok(policyCriteriaSearchPolicyLevelConversionController);
    }

    @PostMapping
    public ResponseEntity<PolicyCriteriaSearchPolicyLevelConversionController> save(@RequestBody PolicyCriteriaSearchPolicyLevelConversionController policyCriteriaSearchPolicyLevelConversionController) {
        PolicyCriteriaSearchPolicyLevelConversionController savedPolicyCriteriaSearchPolicyLevelConversionController = policyCriteriaSearchPolicyLevelConversionControllerService.save(policyCriteriaSearchPolicyLevelConversionController);
        return ResponseEntity.ok(savedPolicyCriteriaSearchPolicyLevelConversionController);
    }

}