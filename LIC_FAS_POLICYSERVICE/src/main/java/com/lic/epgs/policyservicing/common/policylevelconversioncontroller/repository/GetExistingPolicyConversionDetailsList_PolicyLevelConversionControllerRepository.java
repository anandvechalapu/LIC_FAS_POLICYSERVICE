@Repository
public interface GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository {

    /**
     * This method is used to retrieve the list of existing policy conversion details based on the provided role and unitCode
     * @param role The role of the user
     * @param unitCode The unit code of the user
     * @return The list of existing policy conversion details based on the provided role and unitCode
     * @throws Exception If an error occurs while retrieving the list of existing policy conversion details
     */
    List<Object> getExistingPolicyConversionDetailsList(String role, String unitCode) throws Exception;
}