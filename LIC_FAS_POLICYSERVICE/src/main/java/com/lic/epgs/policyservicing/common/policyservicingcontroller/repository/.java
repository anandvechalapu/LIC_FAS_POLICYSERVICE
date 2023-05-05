@Repository
public class PolicyServiceSearchRepository {

    public CommonResponseDto searchPolicyServices(PolicySearchDto searchDto) {
        try {
            List<PolicyServiceDto> policyServiceDtos = new ArrayList<>();
            //Query the database using the searchDto object
            //Populate the policyServiceDtos list with the results
            CommonResponseDto responseDto = new CommonResponseDto();
            responseDto.setStatus("success");
            responseDto.setMessage("Policy services found!");
            responseDto.setResponseData(policyServiceDtos);
            return responseDto;
        } catch (Exception e) {
            CommonResponseDto responseDto = new CommonResponseDto();
            responseDto.setStatus("error");
            responseDto.setMessage("Error while searching for policy services!");
            return responseDto;
        }
    }
}