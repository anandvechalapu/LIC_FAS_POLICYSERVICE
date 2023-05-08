@Repository
public interface SaveBankDetails_PolicyLevelFreeLookCancelControllerRepository {

    /**
     * Save or update the bank details for a policy in the free look cancellation feature.
     *
     * @param policyBankOldDto  The PolicyBankOldDto object containing the necessary information for saving bank details.
     * @return FreeLookCancellationResponseDto object with the saved or updated bank details and the transaction details.
     */
    FreeLookCancellationResponseDto saveBankDetails(PolicyBankOldDto policyBankOldDto);

}