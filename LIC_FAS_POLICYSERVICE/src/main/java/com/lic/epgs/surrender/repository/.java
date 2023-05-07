@Repository
public class ExitingSurrenderRepository {

    public PolicySurrenderApiResponse getExitingSurrenderPolicies(String roleType, String pageName) {
        PolicySurrenderApiResponse response;
        try {
            List<PolicySurrender> surrenders = retrieveSurrenders(roleType, pageName);
            // map the list of surrenders to a list of PolicySurrenderDto objects
            List<PolicySurrenderDto> mappedSurrenders = mapList(surrenders);
            // sort the list of surrenders in ascending order of their surrender ID
            mappedSurrenders.sort(Comparator.comparing(PolicySurrenderDto::getSurrenderId));
            response = new PolicySurrenderApiResponse(mappedSurrenders, TransactionStatus.SUCCESS, "");
        } catch (Exception ex) {
            response = new PolicySurrenderApiResponse(null, TransactionStatus.FAIL, ex.getMessage());
        }
        return response;
    }
    
    private List<PolicySurrender> retrieveSurrenders(String roleType, String pageName) {
        // code to retrieve a list of policy surrenders based on the role type and page name
    }
    
    private List<PolicySurrenderDto> mapList(List<PolicySurrender> surrenders) {
        // code to map the list of surrenders to a list of PolicySurrenderDto objects
    }
}