package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.SaveBankDetails_PolicyLevelDetailsChangeController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SaveBankDetails_PolicyLevelDetailsChangeControllerRepository extends JpaRepository<SaveBankDetails_PolicyLevelDetailsChangeController, Long> {

    SaveBankDetails_PolicyLevelDetailsChangeController save(SaveBankDetails_PolicyLevelDetailsChangeController saveBankDetails_PolicyLevelDetailsChangeController);
    
    SaveBankDetails_PolicyLevelDetailsChangeController findByMphBankId(Long mphBankId);
    
    @Modifying
    @Transactional
    @Query("UPDATE SaveBankDetails_PolicyLevelDetailsChangeController SET isActive = true, isDefault = false WHERE mphBankId = :mphBankId")
    void updateBankDetails(@Param("mphBankId") Long mphBankId);
    
    @Query("INSERT INTO log_table (start_time, end_time) VALUES (:startTime, :endTime)")
    void logExecutionTime(@Param("startTime") Date startTime, @Param("endTime") Date endTime);
}

@Service
public class SaveBankDetails_PolicyLevelDetailsChangeControllerService {
    
    @Autowired
    private SaveBankDetails_PolicyLevelDetailsChangeControllerRepository saveBankDetails_PolicyLevelDetailsChangeControllerRepository;

    public SaveBankDetails_PolicyLevelDetailsChangeController save(SaveBankDetails_PolicyLevelDetailsChangeController saveBankDetails_PolicyLevelDetailsChangeController) {
        return saveBankDetails_PolicyLevelDetailsChangeControllerRepository.save(saveBankDetails_PolicyLevelDetailsChangeController);
    }

    public SaveBankDetails_PolicyLevelDetailsChangeController findByMphBankId(Long mphBankId) {
        return saveBankDetails_PolicyLevelDetailsChangeControllerRepository.findByMphBankId(mphBankId);
    }

    public void updateBankDetails(Long mphBankId) {
        saveBankDetails_PolicyLevelDetailsChangeControllerRepository.updateBankDetails(mphBankId);
    }

    public void logExecutionTime(Date startTime, Date endTime) {
        saveBankDetails_PolicyLevelDetailsChangeControllerRepository.logExecutionTime(startTime, endTime);
    }
    
}