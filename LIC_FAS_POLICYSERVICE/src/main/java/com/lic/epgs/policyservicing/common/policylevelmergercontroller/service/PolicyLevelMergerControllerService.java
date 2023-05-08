@Service
public class PolicyLevelMergerControllerService {

    @Autowired
    private PolicyLevelMergerControllerRepository policyLevelMergerControllerRepository;

    public PolicyServiceDocumentDto save(PolicyServiceDocumentDto policyServiceDocumentDto) {
        return policyLevelMergerControllerRepository.save(policyServiceDocumentDto);
    }

    public boolean existsByDocumentName(String documentName) {
        return policyLevelMergerControllerRepository.existsByDocumentName(documentName);
    }

    public void setActive(String documentName) {
        policyLevelMergerControllerRepository.setActive(documentName);
    }
}