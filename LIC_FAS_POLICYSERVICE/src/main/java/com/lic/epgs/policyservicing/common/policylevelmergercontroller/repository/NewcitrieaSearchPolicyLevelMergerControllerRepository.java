@Repository
public interface NewcitrieaSearchPolicyLevelMergerControllerRepository {
    ResponseEntity<PolicyResponseDto> citrieaSearch(@Valid @RequestBody SearchParametersDto searchParameters);
}