package com.lic.epgs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jira_to_angular")
public class JiraToAngular {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userStoryId;
    
    private String userStory;
    
    private String jiraTaskId;
    
    private String angularComponent;
    
    public JiraToAngular() {
        
    }

    public Long getUserStoryId() {
        return userStoryId;
    }

    public void setUserStoryId(Long userStoryId) {
        this.userStoryId = userStoryId;
    }

    public String getUserStory() {
        return userStory;
    }

    public void setUserStory(String userStory) {
        this.userStory = userStory;
    }

    public String getJiraTaskId() {
        return jiraTaskId;
    }

    public void setJiraTaskId(String jiraTaskId) {
        this.jiraTaskId = jiraTaskId;
    }

    public String getAngularComponent() {
        return angularComponent;
    }

    public void setAngularComponent(String angularComponent) {
        this.angularComponent = angularComponent;
    }
}