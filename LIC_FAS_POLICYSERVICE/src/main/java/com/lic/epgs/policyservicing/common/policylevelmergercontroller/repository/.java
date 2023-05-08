@Repository
public class PolicyLevelMergerControllerRepository {

    public PolicyLevelMergerApiResponse saveAndUpdatePolicyLevelMerger(PolicyLevelMergerDto policyLevelMergerDto) {

        try {
            // validate policy numbers and types
            validPolicyNumberAndType(policyLevelMergerDto);

            // Get policy master entity
            PolicyMaster policyMaster = policyMasterRepository.findByPolicyNumber(policyLevelMergerDto.getPolicyNumber());
            if (policyMaster == null) {
                throw new IllegalArgumentException("Invalid policy number!");
            }

            // Get mph master entity
            MphMaster mphMaster = mphMasterRepository.findByMphCode(policyLevelMergerDto.getMphCode());
            if (mphMaster == null) {
                throw new IllegalArgumentException("Invalid mph code!");
            }

            // Map DTO to Entity
            PolicyLevelMergerTemp policyLevelMergerTemp = modelMapper.map(policyLevelMergerDto, PolicyLevelMergerTemp.class);
            policyLevelMergerTemp.setPolicyMaster(policyMaster);
            policyLevelMergerTemp.setMphMaster(mphMaster);

            // Save or update the policy level merger details
            if (policyLevelMergerDto.getMergeId() != null) {
                // Update existing record
                policyLevelMergerTemp.setModifiedBy(policyLevelMergerDto.getModifiedBy());
            } else {
                // Create new record
                policyLevelMergerTemp.setCreatedBy(policyLevelMergerDto.getCreatedBy());
                policyLevelMergerTemp.setCreatedOn(LocalDateTime.now());
                policyLevelMergerTemp.setIsActive(true);
            }
            policyLevelMergerTempRepository.save(policyLevelMergerTemp);

            // Return the saved or updated policy level merger details
            PolicyLevelMergerApiResponse response = modelMapper.map(policyLevelMergerTemp, PolicyLevelMergerApiResponse.class);
            response.setMessage("Policy level merger details saved/updated successfully!");
            return response;
        } catch (IllegalArgumentException e) {
            logger.error("Error while saving/updating the policy level merger details: {}", e.getMessage());
            return new PolicyLevelMergerApiResponse("Error while saving/updating the policy level merger details!", e.getMessage());
        }
    }

    private void validPolicyNumberAndType(PolicyLevelMergerDto policyLevelMergerDto) {
        // Validate policy numbers and types
        // TODO - Add code for validating policy numbers and types
    }

}