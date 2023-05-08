import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyRulesDto;

public interface SaveBenefitTypes_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyRulesDto, Long> {

    /**
     * Saves the policy rules data by calling the saveBenefitTypes API endpoint.
     *
     * @param policyRulesDtoList The list of policy rules DTOs to save.
     * @return The response with the transaction status and message.
     */
    ResponseDto saveBenefitTypes(List<PolicyRulesDto> policyRulesDtoList);

}