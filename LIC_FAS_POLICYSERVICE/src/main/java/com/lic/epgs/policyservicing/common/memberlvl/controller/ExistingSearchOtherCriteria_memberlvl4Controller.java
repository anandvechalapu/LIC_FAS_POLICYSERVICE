@Repository
public interface ExistingSearchOtherCriteria_memberlvl4Repository extends JpaRepository<ExistingSearchOtherCriteria_memberlvl4, Long> {

    ResponseDto findByCommissionSearchDto(CommissionSearchDto commissionSearchDto);
    
    boolean existsByCommissionSearchDto(CommissionSearchDto commissionSearchDto);

}


package com.lic.epgs.policyservicing.common.memberlvl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.ExistingSearchOtherCriteria_memberlvl4;
import com.lic.epgs.policyservicing.common.memberlvl.service.ExistingSearchOtherCriteria_memberlvl4Service;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.ResponseDto;

@RestController
@RequestMapping("/existingSearchOtherCriteria_memberlvl4")
public class ExistingSearchOtherCriteria_memberlvl4Controller {
    
    @Autowired
    private ExistingSearchOtherCriteria_memberlvl4Service existingSearchOtherCriteria_memberlvl4Service;

    @GetMapping("/findByCommissionSearchDto")
    public ResponseDto findByCommissionSearchDto(CommissionSearchDto commissionSearchDto) {
        return existingSearchOtherCriteria_memberlvl4Service.findByCommissionSearchDto(commissionSearchDto);
    }
    
    @GetMapping("/existsByCommissionSearchDto")
    public boolean existsByCommissionSearchDto(CommissionSearchDto commissionSearchDto) {
        return existingSearchOtherCriteria_memberlvl4Service.existsByCommissionSearchDto(commissionSearchDto);
    }
}