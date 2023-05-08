@Repository
public interface PolicyLevelFreeLookCancelControllerRepository {
    CommonResponseDto<Object> getAllMembers(PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto);
}