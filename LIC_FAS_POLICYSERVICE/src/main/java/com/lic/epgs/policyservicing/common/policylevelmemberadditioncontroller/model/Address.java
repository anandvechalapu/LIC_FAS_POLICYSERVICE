package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long memberId;

private String addressLine1;

private String addressLine2;

private String city;

private String state;

private String country;

private String zipcode;

private Boolean active;

//getters and setters

}