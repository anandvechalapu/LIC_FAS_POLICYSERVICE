package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.repository.ExitingSurrenderRepository;
import com.lic.epgs.transaction.model.TransactionStatus;
import com.lic.epgs.transaction.response.PolicySurrenderApiResponse;
import com.lic.epgs.transaction.response.dto.PolicySurrenderDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ExitingSurrenderService {

    @Autowired
    ExitingSurrenderRepository repository;

    public PolicySurrenderApiResponse getExitingSurrenderPolicies(String roleType, String pageName) {
        return repository.getExitingSurrenderPolicies(roleType, pageName);
    }
}

package com.lic.epgs.surrender.controller;

import com.lic.epgs.transaction.model.TransactionStatus;
import com.lic.epgs.transaction.response.PolicySurrenderApiResponse;
import com.lic.epgs.transaction.response.dto.PolicySurrenderDto;
import com.lic.epgs.surrender.service.ExitingSurrenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExitingSurrenderController {

    @Autowired
    ExitingSurrenderService service;

    @GetMapping("/surrender/policies")
    public PolicySurrenderApiResponse getExitingSurrenderPolicies(@RequestParam String roleType,
            @RequestParam String pageName) {
        return service.getExitingSurrenderPolicies(roleType, pageName);
    }

}