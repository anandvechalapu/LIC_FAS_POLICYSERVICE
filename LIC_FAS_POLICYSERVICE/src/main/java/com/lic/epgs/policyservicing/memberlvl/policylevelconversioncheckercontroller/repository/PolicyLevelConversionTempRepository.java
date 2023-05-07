package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionTemp;

@Repository
public interface PolicyLevelConversionTempRepository extends JpaRepository<PolicyLevelConversionTemp, String> {

	public PolicyLevelConversionTemp findByConversionId(String conversionId);

	public void save(PolicyLevelConversionTemp policyLevelConversionTemp);

}