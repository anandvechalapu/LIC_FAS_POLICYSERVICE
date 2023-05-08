package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyServiceNotesTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SaveNotesDetails_PolicyLevelDetailsChangeControllerRepository extends JpaRepository<PolicyServiceNotesTempEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE PolicyServiceNotesTempEntity t SET t.active = true where t.policyId = :policyId")
    void setPolicyServiceNotesActive(@Param("policyId") Long policyId);

}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller; 

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyServiceNotesTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.SaveNotesDetails_PolicyLevelDetailsChangeControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/policyLevelDetailsChangeController")
public class SaveNotesDetails_PolicyLevelDetailsChangeControllerController {

    @Autowired
    SaveNotesDetails_PolicyLevelDetailsChangeControllerService saveNotesDetails_PolicyLevelDetailsChangeControllerService;

    @PostMapping("/saveNotesDetails")
    public void saveNotesDetails(@RequestBody PolicyServiceNotesTempEntity policyServiceNotesTempEntity){
        saveNotesDetails_PolicyLevelDetailsChangeControllerService.saveNotesDetails(policyServiceNotesTempEntity);
    }

    @PostMapping("/setPolicyServiceNotesActive")
    public void setPolicyServiceNotesActive(@RequestParam Long policyId){
        saveNotesDetails_PolicyLevelDetailsChangeControllerService.setPolicyServiceNotesActive(policyId);
    }

}