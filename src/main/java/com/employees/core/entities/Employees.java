/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JEREMY
 */
@Entity
@Table(name = "employees", catalog = "employees", schema = "")
@XmlRootElement
public class Employees implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Column(name = "id_identity_document_type")
  private Integer idIdentityDocumentType;
  @Column(name = "id_job_area")
  private Integer idJobArea;
  @Column(name = "id_job_country")
  private Integer idJobCountry;
  @Size(max = 20)
  @Column(name = "first_name")
  private String firstName;
  @Size(max = 20)
  @Column(name = "last_name")
  private String lastName;
  @Size(max = 20)
  @Column(name = "second_name")
  private String secondName;
  @Size(max = 50)
  @Column(name = "other_name")
  private String otherName;
  @Size(max = 20)
  @Column(name = "identification")
  private String identification;
  // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
  @Size(max = 300)
  @Column(name = "email")
  private String email;
  @Basic(optional = false)
  @NotNull
  @Column(name = "date_entry")
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateEntry;
  @Column(name = "state")
  private Boolean state;
  @Basic(optional = false)
  @NotNull
  @Column(name = "registration_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date registrationDate;

  public Employees() {
  }

  public Employees(Integer id) {
    this.id = id;
  }

  public Employees(Integer id, Date dateEntry, Date registrationDate) {
    this.id = id;
    this.dateEntry = dateEntry;
    this.registrationDate = registrationDate;
  }

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

  public Integer getIdJobArea() {
    return idJobArea;
  }

  public void setIdJobArea(Integer idJobArea) {
    this.idJobArea = idJobArea;
  }

  public Integer getIdJobCountry() {
    return idJobCountry;
  }

  public void setIdJobCountry(Integer idJobCountry) {
    this.idJobCountry = idJobCountry;
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

  public Date getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(Date registrationDate) {
    this.registrationDate = registrationDate;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Employees)) {
      return false;
    }
    Employees other = (Employees) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "com.employees.core.entities.Employees[ id=" + id + " ]";
  }
  
}
