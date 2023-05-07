@Repository
public interface PolicySearchForSurrenderRepository {
  
    //Method to search for policy details for surrender using the policy number
    public List<PolicySearchForSurrender> getPolicyDetailsByPolicyNumber(int policyNumber);

    //Method to check if policy record with the given policy number exists in the policy database
    public boolean isPolicyNumberExists(int policyNumber);

    //Method to return the policy details in the response object
    public PolicySearchForSurrender getResponseObject(int policyNumber);

    //Method to return an error message with a failure status code 
    public String getErrorMessage(int policyNumber);

    //Method to return a transaction status
    public String getTransactionStatus(int policyNumber);

    //Method to return a transaction message
    public String getTransactionMessage(int policyNumber);
}