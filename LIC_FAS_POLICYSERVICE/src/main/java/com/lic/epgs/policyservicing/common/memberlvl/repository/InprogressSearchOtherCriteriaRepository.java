@Repository
public interface InprogressSearchOtherCriteriaRepository {

    /**
     * This method is used to perform a search for commissions that are in progress 
     * using other criteria besides the default search parameters.
     *
     * @param commissionSearchDto The CommissionSearchDto object passed in the request body should contain the necessary search criteria required to perform the search.
     * @param role The role parameter passed in the request should contain the user's role information.
     * @return ResponseEntity<CommonCommissionDto> The response should contain the commission information that matches the search criteria.
     */
    ResponseEntity<CommonCommissionDto> inprogressSearchOtherCriteria(CommissionSearchDto commissionSearchDto, String role);
}