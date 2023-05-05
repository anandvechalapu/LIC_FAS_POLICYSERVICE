import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionDto;

public interface CommissionTempRepository extends JpaRepository<CommissionDto, Integer> {

  /**
   * Method to approve the commission by the checker role.
   *
   * @param commissionId the ID of the commission to be approved
   * @param role the role of the checker user who is approving the commission
   * @return CommissionDto the CommissionDto object of the updated commission
   */
  CommissionDto checkerApprove(int commissionId, String role);

}