@Repository
public interface SavePolicyServiceRepository {
  
  // Method to save policy service
  CommonResponseDto<PolicyServiceDto> savePolicyService(PolicyServiceModuleDto policyServiceModuleDto) throws ApplicationException; 
  
  // Method to save temp conversion
  CommonResponseDto<PolicyServiceDto> saveTempConversion() throws ApplicationException;
  
  // Method to save temp policy module
  CommonResponseDto<PolicyServiceDto> saveTempPolicyModule() throws ApplicationException;
  
  // Method to log error
  void logError(String errorMessage);
}