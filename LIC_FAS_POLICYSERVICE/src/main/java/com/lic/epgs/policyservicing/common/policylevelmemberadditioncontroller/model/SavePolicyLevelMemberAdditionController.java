package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavePolicyLevelMemberAdditionController {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String componentName;
   private String memberAdditionId;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getComponentName() {
      return componentName;
   }

   public void setComponentName(String componentName) {
      this.componentName = componentName;
   }

   public String getMemberAdditionId() {
      return memberAdditionId;
   }

   public void setMemberAdditionId(String memberAdditionId) {
      this.memberAdditionId = memberAdditionId;
   }

}