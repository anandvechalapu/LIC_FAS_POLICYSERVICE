package com.lic.epgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WebServiceRepository extends JpaRepository<Object, Long> {
    // Customer fetch/Demographic API along with CRIF score
    Object getCustomerData(String authentication);

    // HLV/PASA sharing API
    Object getPolicyData(String authentication);

    // Direct Debit API
    Object processPremiumPayments(String authentication);

    // COI download API
    Object getCOIs(String authentication);
}