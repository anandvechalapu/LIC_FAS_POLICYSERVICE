import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionTempEntity;

public interface PolicyConversionRejection_PolicyLevelConversionCheckerControllerRepository extends JpaRepository<PolicyLevelConversionTempEntity, Integer> {

    PolicyLevelConversionTempEntity findByConversionId(String conversionId);

    PolicyLevelConversionTempEntity save(PolicyLevelConversionTempEntity policyLevelConversionTempEntity);

    int updatePolicyLevelConversionTempEntity(String conversionId, String rejectionReasonCode, String remarks, String modifiedBy, String modifiedOn);

    int updatePolicyLevelConversionEntity(String conversionId, String rejectionReasonCode,String modifiedBy, String modifiedOn);

}