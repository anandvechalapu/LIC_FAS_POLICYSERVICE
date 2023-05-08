import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.InProgressCommonSearch;

public interface InProgressCommonSearch_PolicyLevelConversionControllerRepository extends JpaRepository<InProgressCommonSearch, Long>{

    List<InProgressCommonSearch> findByMphCodeAndMphNameAndStatusAndProductAndUnitCodeOrderByModifiedOnDesc(String mphCode, String mphName, String status, String product, String unitCode);
    
    List<InProgressCommonSearch> findByMphCodeAndMphNameAndStatusAndProductAndUnitCode(String mphCode, String mphName, String status, String product, String unitCode, Pageable pageable);
    
    List<InProgressCommonSearch> findByMphCodeAndMphNameAndStatusAndProductAndUnitCodeOrderByModifiedOnDesc(String mphCode, String mphName, String status, String product, String unitCode, Pageable pageable);

}