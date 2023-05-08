@Repository
public interface GetBankList_PolicyLevelFreeLookCancelControllerRepository {
    
    /**
     * Retrieves a list of bank details associated with a specific bank ID
     * @param id
     * @return FreeLookCancellationResponseDto 
     */
    FreeLookCancellationResponseDto getBankList(Long id);
    
    /**
     * Uses the mphBankTempRepository to retrieve the bank details associated with the specified id
     * @param id
     * @return MphBankDto
     */
    MphBankDto getBankDetailsById(Long id);
    
    /**
     * Converts the MphBankDto to the PolicyBankOldDto
     * @param mphBankDto
     * @return PolicyBankOldDto
     */
    PolicyBankOldDto convertNewDtoToOld(MphBankDto mphBankDto);
    
    /**
     * Sets the transaction status, transaction message, and policy bank DTO
     * @param commonDto
     * @param policyBankOldDto
     * @param status
     * @param message
     */
    void setTransactionStatusAndMessage(CommonDto commonDto, PolicyBankOldDto policyBankOldDto, String status, String message);
    
    /**
     * Logs the start and end time of the getBankList method execution
     * @param start
     * @param end
     */
    void logGetBankListExecutionTime(Instant start, Instant end);

}