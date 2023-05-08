@RestController
@RequestMapping("/api/policylevelfreelookcancel")
public class PolicyLevelFreeLookCancelController {
  
    @Autowired
    private PolicySearchForFreeLookCancellation_PolicyLevelFreeLookCancelControllerService service;
    
    @GetMapping("/policy/{policyNumber}")
    public ResponseEntity<Object> getPolicyForFreeLookCancellation(@PathVariable String policyNumber) {
        
        Optional<PolicyDetails> policyDetails = service.findByPolicyNumber(policyNumber);
        
        if(policyDetails.isPresent()) {
            return new ResponseEntity<>(policyDetails.get(), HttpStatus.OK);
        }
        
        return new ResponseEntity<>("No policy details found for policy number: " + policyNumber, HttpStatus.NOT_FOUND);
    }
    
    @PostMapping("/process")
    public ResponseEntity<Object> logProcess(@RequestParam Date startTime, @RequestParam Date endTime) {
        
        boolean isLogged = service.logProcess(startTime, endTime);
        
        if(isLogged) {
            return new ResponseEntity<>("Successfully logged the process.", HttpStatus.OK);
        }
        
        return new ResponseEntity<>("Failed to log the process.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}