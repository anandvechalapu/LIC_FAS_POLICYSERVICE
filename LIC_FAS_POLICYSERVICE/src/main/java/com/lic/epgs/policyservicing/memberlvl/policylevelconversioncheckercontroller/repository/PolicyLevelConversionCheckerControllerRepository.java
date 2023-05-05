@Repository
public interface PolicyLevelConversionCheckerControllerRepository {
    
    // Method to perform existing common search using various search parameters
    public List<PolicyConversion> existingCommonSearch(String mphCode, String mphName, String status, String product, String unitCode, int pageCount, int limit);
    
    // Method to set transaction status
    public void setStatus(String status);

    // Method to set transaction message
    public void setMessage(String message);

    // Method to set default limit of 5000 records
    public void setDefaultLimit(int limit);

    // Method to set default page count of 0
    public void setDefaultPageCount(int pageCount);

    // Method to sort the results in descending order by the createdOn field
    public void sortByCreatedOn();

    // Method to ignore blank search parameters
    public void ignoreBlankSearchParameters();

    // Method to return error transaction status and message
    public void returnErrorTransactionStatusAndMessage();

}