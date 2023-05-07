@Repository
public interface SurrenderPayoutCalculationRepository {
    
    /**
     * Method to calculate the surrender payout of a policy
     * @param policyId
     * @param surrenderReqDate
     * @param fundValue
     * @param modeOfPay
     * @param noOfInstallment
     * @return JSON response containing the calculated surrender payout amount, applicable charges and fees, and final surrender payout amount
     */
    public JSONObject calculateSurrenderPayout(String policyId, Date surrenderReqDate, Double fundValue, String modeOfPay, int noOfInstallment);
    
    /**
     * Method to handle errors for missing or invalid input parameters
     * @param policyId
     * @param surrenderReqDate
     * @param fundValue
     * @param modeOfPay
     * @param noOfInstallment
     * @return JSON response containing the appropriate error message
     */
    public JSONObject handleError(String policyId, Date surrenderReqDate, Double fundValue, String modeOfPay, int noOfInstallment);
    
    /**
     * Method to handle exceptions and return an appropriate error message
     * @return JSON response containing the appropriate error message
     */
    public JSONObject handleException();
}