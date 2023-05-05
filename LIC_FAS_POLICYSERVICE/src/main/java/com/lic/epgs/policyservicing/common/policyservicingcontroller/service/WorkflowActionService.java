import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.WorkflowAction;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.WorkflowActionRepository;

@Service
public class WorkflowActionService {

    @Autowired
    private WorkflowActionRepository workflowActionRepository;

    public WorkflowAction findByServiceTypeAndRoleAndPage(String serviceType, String role, String page){
        return workflowActionRepository.findByServiceTypeAndRoleAndPage(serviceType, role, page);
    }

    public void save(WorkflowAction workflowAction) {
        workflowActionRepository.save(workflowAction);
    }

    public void delete(WorkflowAction workflowAction) {
        workflowActionRepository.delete(workflowAction);
    }

    public boolean existsByServiceTypeAndRoleAndPage(String serviceType, String role, String page) {
        return workflowActionRepository.existsByServiceTypeAndRoleAndPage(serviceType, role, page);
    }

}