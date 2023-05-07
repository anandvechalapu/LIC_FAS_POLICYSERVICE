package com.lic.epgs.surrender.controller;

import com.lic.epgs.surrender.model.RejectPolicySurrender_PolicySurrender;
import com.lic.epgs.surrender.service.RejectPolicySurrender_PolicySurrenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/surrender")
public class RejectPolicySurrender_PolicySurrenderController {

    @Autowired
    private RejectPolicySurrender_PolicySurrenderService rejectPolicySurrender_PolicySurrenderService;

    @GetMapping("/status")
    public RejectPolicySurrender_PolicySurrender findBySurrenderStatus(@RequestParam String status){
        return rejectPolicySurrender_PolicySurrenderService.findBySurrenderStatus(status);
    }

    @PostMapping("/save")
    public RejectPolicySurrender_PolicySurrender save(@RequestBody RejectPolicySurrender_PolicySurrender policySurrender){
        return rejectPolicySurrender_PolicySurrenderService.save(policySurrender);
    }

    @PutMapping("/update")
    public RejectPolicySurrender_PolicySurrender update(@RequestBody RejectPolicySurrender_PolicySurrender policySurrender){
        return rejectPolicySurrender_PolicySurrenderService.update(policySurrender);
    }

    @PostMapping("/create")
    public RejectPolicySurrender_PolicySurrender create(@RequestBody RejectPolicySurrender_PolicySurrender policySurrender){
        return rejectPolicySurrender_PolicySurrenderService.create(policySurrender);
    }

    @PostMapping("/copy")
    public RejectPolicySurrender_PolicySurrender copy(@RequestBody RejectPolicySurrender_PolicySurrender policySurrender){
        return rejectPolicySurrender_PolicySurrenderService.copy(policySurrender);
    }

    @GetMapping("/all")
    public List<RejectPolicySurrender_PolicySurrender> findAll(){
        return rejectPolicySurrender_PolicySurrenderService.findAll();
    }

}