import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.WorkflowAction;

public interface WorkflowActionRepository extends JpaRepository<WorkflowAction, Long> {

    WorkflowAction findByServiceTypeAndRoleAndPage(String serviceType, String role, String page);

    void save(WorkflowAction workflowAction);

    void delete(WorkflowAction workflowAction);

    boolean existsByServiceTypeAndRoleAndPage(String serviceType, String role, String page);

}