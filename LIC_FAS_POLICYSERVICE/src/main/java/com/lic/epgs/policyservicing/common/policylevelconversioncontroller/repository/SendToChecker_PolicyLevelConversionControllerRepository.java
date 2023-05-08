import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.PolicyLevelConversionTempEntity;

public interface SendToChecker_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversionTempEntity, String> {

    PolicyLevelConversionTempEntity findByConversionId(String conversionId);
    
    PolicyLevelConversionTempEntity saveAndFlush(PolicyLevelConversionTempEntity policyLevelConversionTempEntity);

}