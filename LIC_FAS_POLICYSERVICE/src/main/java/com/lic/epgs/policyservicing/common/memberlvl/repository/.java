@Repository
public class GetInprogressLoadRepository {

    private final Logger logger = LoggerFactory.getLogger(GetInprogressLoadRepository.class);

    @Autowired
    private EntityManager entityManager;

    public TransferInAndOutResponseDto getInprogressLoad(String role, String unitCode) {
        TransferInAndOutResponseDto responseDto = new TransferInAndOutResponseDto();
        try {
            if(role == null || role.isBlank() || unitCode == null || unitCode.isBlank()) {
                return responseDto;
            }
            logger.info("Starting getInprogressLoad with role: {}, unitCode: {}", role, unitCode);
            String queryString = "";
            if(role.equals("checker")) {
                queryString = "select * from transfers where transfer_status = 'in-progress-checker' and unit_code = :unitCode order by modified_date desc";
            } else if(role.equals("maker")) {
                queryString = "select * from transfers where transfer_status = 'in-progress-maker' and unit_code = :unitCode order by modified_date desc";
            }
            Query query = entityManager.createNativeQuery(queryString, Transfer.class);
            query.setParameter("unitCode", unitCode);
            List<Transfer> transfers = query.getResultList();
            if(transfers.isEmpty()) {
                responseDto.setTransactionMessage("No record found");
                responseDto.setTransactionStatus("Fail");
            } else {
                List<TransferInAndOutDto> transferInAndOutDtos = new ArrayList<>();
                for(Transfer transfer : transfers) {
                    transferInAndOutDtos.add(mapToTransferInAndOutDto(transfer));
                }
                responseDto.setData(transferInAndOutDtos);
            }
            logger.info("Ending getInprogressLoad with role: {}, unitCode: {}", role, unitCode);
        } catch(Exception e) {
            logger.error("Exception while executing getInprogressLoad with role: {}, unitCode: {}", role, unitCode, e);
            responseDto.setTransactionMessage(e.getMessage());
            responseDto.setTransactionStatus("Fail");
        }
        return responseDto;
    }

    private TransferInAndOutDto mapToTransferInAndOutDto(Transfer transfer) {
        // implement mapping from Transfer to TransferInAndOutDto
    }
}