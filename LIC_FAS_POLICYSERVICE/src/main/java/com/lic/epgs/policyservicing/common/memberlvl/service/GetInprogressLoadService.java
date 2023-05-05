@Service
public class GetInprogressLoadService {

    private final Logger logger = LoggerFactory.getLogger(GetInprogressLoadService.class);

    @Autowired
    private GetInprogressLoadRepository getInprogressLoadRepository;

    public TransferInAndOutResponseDto getInprogressLoad(String role, String unitCode) {
        TransferInAndOutResponseDto responseDto = new TransferInAndOutResponseDto();
        try {
            if(role == null || role.isBlank() || unitCode == null || unitCode.isBlank()) {
                return responseDto;
            }
            logger.info("Starting getInprogressLoad with role: {}, unitCode: {}", role, unitCode);
            responseDto = getInprogressLoadRepository.getInprogressLoad(role, unitCode);
            logger.info("Ending getInprogressLoad with role: {}, unitCode: {}", role, unitCode);
        } catch(Exception e) {
            logger.error("Exception while executing getInprogressLoad with role: {}, unitCode: {}", role, unitCode, e);
            responseDto.setTransactionMessage(e.getMessage());
            responseDto.setTransactionStatus("Fail");
        }
        return responseDto;
    }
}