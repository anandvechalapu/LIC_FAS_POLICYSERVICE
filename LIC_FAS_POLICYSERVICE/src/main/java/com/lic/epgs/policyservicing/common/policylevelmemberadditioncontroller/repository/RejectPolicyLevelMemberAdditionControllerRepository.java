@Repository
public interface RejectPolicyLevelMemberAdditionControllerRepository {

   public ResponseEntity<?> rejectPolicyLevelMemberAddition(String memberAdditionId, String unitCode, String modifiedBy, LocalDateTime modifiedOn);

}