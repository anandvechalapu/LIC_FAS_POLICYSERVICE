@Repository
public interface SaveAndUpdatePolicyLevelMergerRepository {

	/**
	 * Method to save or update policy level merger details
	 * 
	 * @param PolicyLevelMergerDto requestBody
	 * @return PolicyLevelMergerApiResponse
	 */
	public PolicyLevelMergerApiResponse saveAndUpdatePolicyLevelMerger(PolicyLevelMergerDto requestBody);

}