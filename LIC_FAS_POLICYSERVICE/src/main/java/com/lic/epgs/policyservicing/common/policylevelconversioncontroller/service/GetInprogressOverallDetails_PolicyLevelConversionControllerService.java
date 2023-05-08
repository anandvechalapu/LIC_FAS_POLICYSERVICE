@Service
public class GetInprogressOverallDetails_PolicyLevelConversionControllerService {

    @Autowired
    private GetInprogressOverallDetails_PolicyLevelConversionControllerRepository getInprogressOverallDetails_PolicyLevelConversionControllerRepository;

    public Optional<PolicyLevelConversionTempEntity> getInprogressOverallDetails(Long serviceId) {
        return getInprogressOverallDetails_PolicyLevelConversionControllerRepository.getInprogressOverallDetails(serviceId);
    }
}