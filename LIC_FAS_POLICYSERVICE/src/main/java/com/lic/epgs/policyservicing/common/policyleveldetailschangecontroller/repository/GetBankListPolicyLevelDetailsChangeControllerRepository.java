@Repository
public interface GetBankListPolicyLevelDetailsChangeControllerRepository {
    /**
     * Retrieves a list of PolicyBankOldDto objects from the database based on the provided mphId
     * The retrieved PolicyBankOldDto objects are converted from MphBankDto objects using the convertNewDtoToOld
     * method.
     * 
     * @param mphId The id of the mph associated with the bank list
     * @return A list of PolicyBankOldDto objects
     */
    List<PolicyBankOldDto> getBankList(Long mphId);
}