import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.ResponseDto;

@Repository
public interface ExistingSearchOtherCriteria_memberlvl4Repository extends JpaRepository<CommissionSearchDto, Long> {

    ResponseDto findByCommissionSearchDto(CommissionSearchDto commissionSearchDto);

    boolean existsByCommissionSearchDto(CommissionSearchDto commissionSearchDto);

}