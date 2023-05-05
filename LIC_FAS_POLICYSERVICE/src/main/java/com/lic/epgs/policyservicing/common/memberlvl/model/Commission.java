package com.lic.epgs.policyservicing.common.memberlvl.model;

import javax.persistence.*;

@Entity
@Table(name="commission")
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "unit_code")
    private String unitCode;

    @Column(name = "is_inprogress")
    private Boolean isInprogress;

    @OneToMany(mappedBy = "commission", cascade = CascadeType.ALL)
    private CommissionDetails commissionDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Boolean getIsInprogress() {
        return isInprogress;
    }

    public void setIsInprogress(Boolean isInprogress) {
        this.isInprogress = isInprogress;
    }

    public CommissionDetails getCommissionDetails() {
        return commissionDetails;
    }

    public void setCommissionDetails(CommissionDetails commissionDetails) {
        this.commissionDetails = commissionDetails;
    }
}