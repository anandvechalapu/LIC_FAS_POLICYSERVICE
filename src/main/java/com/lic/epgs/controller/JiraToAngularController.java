package com.lic.epgs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.model.JiraToAngular;
import com.lic.epgs.service.JiraToAngularService;

@RestController
@RequestMapping("/jiraToAngular")
public class JiraToAngularController {

  @Autowired
  private JiraToAngularService jiraToAngularService;

  @GetMapping
  public List<JiraToAngular> getAllJiraToAngular() {
    return jiraToAngularService.getAllJiraToAngular();
  }

  @GetMapping("/{userStoryId}")
  public Optional<JiraToAngular> getJiraToAngularById(@PathVariable Long userStoryId) {
    return jiraToAngularService.getJiraToAngularById(userStoryId);
  }

  @DeleteMapping("/{userStoryId}")
  public void deleteJiraToAngularById(@PathVariable Long userStoryId) {
    jiraToAngularService.deleteJiraToAngularById(userStoryId);
  }

  @PostMapping
  public JiraToAngular saveJiraToAngular(@RequestBody JiraToAngular jiraToAngular) {
    return jiraToAngularService.saveJiraToAngular(jiraToAngular);
  }
}