package com.lic.epgs.policyservicing.common.policyservicingcontroller.repository;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchPolicyByPolicyIdRepository extends JpaRepository<PolicyDetails, String> {

    @Query("SELECT p FROM PolicyDetails p WHERE p.policyId = ?1")
    List<PolicyDetails> searchPolicyByPolicyId(String policyId);

}

package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyDetails;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.SearchPolicyByPolicyIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/policies")
public class SearchPolicyByPolicyIdController {

    @Autowired
    private SearchPolicyByPolicyIdService searchPolicyByPolicyIdService;

    @GetMapping("/{policyId}")
    public ResponseEntity<List<PolicyDetails>> searchPolicyByPolicyId(@PathVariable String policyId) {
        return ResponseEntity.ok(searchPolicyByPolicyIdService.searchPolicyByPolicyId(policyId));
    }
}