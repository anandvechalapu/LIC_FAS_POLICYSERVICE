package com.lic.epgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.model.JiraToAngular;

@Repository
public interface JiraToAngularRepository extends JpaRepository<JiraToAngular, Long>{

    JiraToAngular findByUserStoryId(Long userStoryId);

    void deleteByUserStoryId(Long userStoryId);

    JiraToAngular saveAndFlush(JiraToAngular jiraToAngular);
}