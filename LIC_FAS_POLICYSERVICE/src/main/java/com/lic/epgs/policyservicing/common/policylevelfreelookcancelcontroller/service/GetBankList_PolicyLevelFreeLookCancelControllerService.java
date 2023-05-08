@Service
public class GetBankList_PolicyLevelFreeLookCancelControllerService {
    
    @Autowired
    private GetBankList_PolicyLevelFreeLookCancelControllerRepository repository;
    
    public FreeLookCancellationResponseDto getBankList(Long id) {
        Instant start = Instant.now();
        FreeLookCancellationResponseDto response = repository.getBankList(id);
        Instant end = Instant.now();
        repository.logGetBankListExecutionTime(start, end);
        return response;
    }

    public MphBankDto getBankDetailsById(Long id) {
        return repository.getBankDetailsById(id);
    }

    public PolicyBankOldDto convertNewDtoToOld(MphBankDto mphBankDto) {
        return repository.convertNewDtoToOld(mphBankDto);
    }

    public void setTransactionStatusAndMessage(CommonDto commonDto, PolicyBankOldDto policyBankOldDto, String status,
            String message) {
        repository.setTransactionStatusAndMessage(commonDto, policyBankOldDto, status, message);
    }

}