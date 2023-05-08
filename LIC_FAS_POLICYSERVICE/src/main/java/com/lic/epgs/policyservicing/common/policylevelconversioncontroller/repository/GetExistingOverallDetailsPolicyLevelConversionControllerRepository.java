package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GetExistingOverallDetailsPolicyLevelConversionControllerRepository extends JpaRepository<Object, Long> {

    Object getExistingOverallDetails(Long serviceId);

}