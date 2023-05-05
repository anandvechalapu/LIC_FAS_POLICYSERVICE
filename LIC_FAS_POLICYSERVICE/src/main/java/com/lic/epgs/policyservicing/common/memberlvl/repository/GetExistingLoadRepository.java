@Repository
public interface GetExistingLoadRepository {
 
  // Method to retrieve data based on role and unit code 
  TransferInAndOutResponseDto getExistingLoad(String role, String unitCode);
 
  // Method to check if data exists for the given role and unit code
  boolean isExistingLoadExists(String role, String unitCode);
 
  // Method to retrieve data from TransferInAndOutMasterEntity table
  List<TransferInAndOutMasterEntity> getMasterEntities(String role, String unitCode);
 
  // Method to retrieve data from TransferInAndOutTempEntity table
  List<TransferInAndOutTempEntity> getTempEntities(String role, String unitCode);
 
}