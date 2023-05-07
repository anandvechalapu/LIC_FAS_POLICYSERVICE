package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.model.RejectPolicySurrender_PolicySurrender;
import com.lic.epgs.surrender.repository.RejectPolicySurrender_PolicySurrenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RejectPolicySurrender_PolicySurrenderService {

    @Autowired
    private RejectPolicySurrender_PolicySurrenderRepository rejectPolicySurrender_PolicySurrenderRepository;

    public RejectPolicySurrender_PolicySurrender findBySurrenderStatus(String status){
        return rejectPolicySurrender_PolicySurrenderRepository.findBySurrenderStatus(status);
    }

    public RejectPolicySurrender_PolicySurrender save(RejectPolicySurrender_PolicySurrender policySurrender){
        return rejectPolicySurrender_PolicySurrenderRepository.save(policySurrender);
    }

    public RejectPolicySurrender_PolicySurrender update(RejectPolicySurrender_PolicySurrender policySurrender){
        return rejectPolicySurrender_PolicySurrenderRepository.update(policySurrender);
    }

    public RejectPolicySurrender_PolicySurrender create(RejectPolicySurrender_PolicySurrender policySurrender){
        return rejectPolicySurrender_PolicySurrenderRepository.create(policySurrender);
    }

    public RejectPolicySurrender_PolicySurrender copy(RejectPolicySurrender_PolicySurrender policySurrender){
        return rejectPolicySurrender_PolicySurrenderRepository.copy(policySurrender);
    }

    public List<RejectPolicySurrender_PolicySurrender> findAll(){
        return rejectPolicySurrender_PolicySurrenderRepository.findAll();
    }

}