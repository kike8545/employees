/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.dto;

import java.util.Date;

/**
 *
 * @author JEREMY
 */
public class EmployeesDTO {

  private Integer id;

  private Integer idIdentityDocumentType;

  private String identDocTypeName;

  private Integer idJobCountry;

  private Integer jobCountryName;

  private String firstName;

  private String lastName;

  private String secondName;

  private String otherName;

  private String identification;

  private String email;

  private Date dateEntry;

  private Boolean state;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdIdentityDocumentType() {
    return idIdentityDocumentType;
  }

  public void setIdIdentityDocumentType(Integer idIdentityDocumentType) {
    this.idIdentityDocumentType = idIdentityDocumentType;
  }

  public String getIdentDocTypeName() {
    return identDocTypeName;
  }

  public void setIdentDocTypeName(String identDocTypeName) {
    this.identDocTypeName = identDocTypeName;
  }

  public Integer getIdJobCountry() {
    return idJobCountry;
  }

  public void setIdJobCountry(Integer idJobCountry) {
    this.idJobCountry = idJobCountry;
  }

  public Integer getJobCountryName() {
    return jobCountryName;
  }

  public void setJobCountryName(Integer jobCountryName) {
    this.jobCountryName = jobCountryName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getOtherName() {
    return otherName;
  }

  public void setOtherName(String otherName) {
    this.otherName = otherName;
  }

  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getDateEntry() {
    return dateEntry;
  }

  public void setDateEntry(Date dateEntry) {
    this.dateEntry = dateEntry;
  }

  public Boolean getState() {
    return state;
  }

  public void setState(Boolean state) {
    this.state = state;
  }

}
