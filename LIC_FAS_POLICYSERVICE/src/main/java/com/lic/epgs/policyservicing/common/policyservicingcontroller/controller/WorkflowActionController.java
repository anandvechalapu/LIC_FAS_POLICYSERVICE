package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.WorkflowAction;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.WorkflowActionService;

@RestController
@RequestMapping("/workflowAction")
public class WorkflowActionController {

    @Autowired
    private WorkflowActionService workflowActionService;

    @GetMapping
    public List<WorkflowAction> list(){
        return workflowActionService.findAll();
    }

    @PostMapping
    public WorkflowAction create(@RequestBody WorkflowAction workflowAction){
        return workflowActionService.save(workflowAction);
    }

    @GetMapping("/{id}")
    public WorkflowAction get(@PathVariable("id") long id){
        return workflowActionService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        workflowActionService.delete(id);
    }
    
    @GetMapping("/serviceType/{serviceType}/role/{role}/page/{page}")
    public WorkflowAction getByServiceTypeAndRoleAndPage(@PathVariable("serviceType") String serviceType, @PathVariable("role") String role, @PathVariable("page") String page){
        return workflowActionService.findByServiceTypeAndRoleAndPage(serviceType, role, page);
    }
}