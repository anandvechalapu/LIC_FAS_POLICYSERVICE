package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<Object, Long> {

    @Query("SELECT * FROM tableau_datafeed")
    Object findTableauDataFeed();

}