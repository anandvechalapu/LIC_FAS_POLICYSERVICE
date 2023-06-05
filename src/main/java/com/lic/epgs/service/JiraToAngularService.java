package com.lic.epgs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.model.JiraToAngular;
import com.lic.epgs.repository.JiraToAngularRepository;

@Service
public class JiraToAngularService {

  @Autowired
  private JiraToAngularRepository jiraToAngularRepository;

  public Optional<JiraToAngular> getJiraToAngularById(Long userStoryId) {
    return jiraToAngularRepository.findByUserStoryId(userStoryId);
  }

  public List<JiraToAngular> getAllJiraToAngular() {
    return jiraToAngularRepository.findAll();
  }

  public void deleteJiraToAngularById(Long userStoryId) {
    jiraToAngularRepository.deleteByUserStoryId(userStoryId);
  }

  public JiraToAngular saveJiraToAngular(JiraToAngular jiraToAngular) {
    return jiraToAngularRepository.saveAndFlush(jiraToAngular);
  }
}