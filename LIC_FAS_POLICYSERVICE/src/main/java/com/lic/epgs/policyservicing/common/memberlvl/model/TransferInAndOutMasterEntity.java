// Generated Entity/Model class
package com.lic.epgs.policyservicing.common.memberlvl.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "transfer_in_and_out_master_entities")
public class TransferInAndOutMasterEntity {
 
    private String role;
    private String unitCode;
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
 
    public String getUnitCode() {
        return unitCode;
    }
 
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
}
 
@Entity
@Table(name = "transfer_in_and_out_temp_entities")
public class TransferInAndOutTempEntity {
 
    private String role;
    private String unitCode;
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
 
    public String getUnitCode() {
        return unitCode;
    }
 
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
}
 
public class TransferInAndOutResponseDto {
 
    private List<TransferInAndOutMasterEntity> masterEntities;
    private List<TransferInAndOutTempEntity> tempEntities;
 
    public List<TransferInAndOutMasterEntity> getMasterEntities() {
        return masterEntities;
    }
 
    public void setMasterEntities(List<TransferInAndOutMasterEntity> masterEntities) {
        this.masterEntities = masterEntities;
    }
 
    public List<TransferInAndOutTempEntity> getTempEntities() {
        return tempEntities;
    }
 
    public void setTempEntities(List<TransferInAndOutTempEntity> tempEntities) {
        this.tempEntities = tempEntities;
    }
}