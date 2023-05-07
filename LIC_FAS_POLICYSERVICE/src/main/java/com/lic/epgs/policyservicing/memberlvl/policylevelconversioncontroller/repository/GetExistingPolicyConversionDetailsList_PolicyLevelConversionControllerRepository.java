@Repository
public interface GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository {

    @Query("SELECT * from policy_conversion_details WHERE role = :role AND unit_code = :unitCode")
    List<PolicyConversionDetails> getExistingPolicyConversionDetailsList(@Param("role") String role, @Param("unitCode") String unitCode);
}