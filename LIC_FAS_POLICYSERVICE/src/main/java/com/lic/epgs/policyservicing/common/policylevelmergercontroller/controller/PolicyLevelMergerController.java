@Repository
public interface PolicyLevelMergerControllerRepository extends JpaRepository<PolicyServiceDocumentDto, Long> {

    boolean existsByDocumentName(String documentName);

    void setActive(String documentName);
}

@RestController
@RequestMapping("/policyLevelMergerController")
public class PolicyLevelMergerController {

    @Autowired
    private PolicyLevelMergerControllerService policyLevelMergerControllerService;

    @PostMapping(value = "/save")
    public ResponseEntity<Object> save(@RequestBody PolicyServiceDocumentDto policyServiceDocumentDto) {
        PolicyServiceDocumentDto savedDocument = policyLevelMergerControllerService.save(policyServiceDocumentDto);
        return new ResponseEntity<>(savedDocument, HttpStatus.CREATED);
    }

    @GetMapping(value = "/existsByDocumentName")
    public ResponseEntity<Object> existsByDocumentName(@RequestParam String documentName) {
        Boolean isExists = policyLevelMergerControllerService.existsByDocumentName(documentName);
        return new ResponseEntity<>(isExists, HttpStatus.OK);
    }

    @PutMapping(value = "/setActive")
    public ResponseEntity<Object> setActive(@RequestParam String documentName) {
        policyLevelMergerControllerService.setActive(documentName);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}