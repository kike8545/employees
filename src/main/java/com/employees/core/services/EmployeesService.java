/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.services;

import com.employees.core.dao.EmployeesDAO;
import com.employees.core.dto.EmployeesDTO;
import com.employees.core.entities.Employees;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JEREMY
 */
@Service
public class EmployeesService implements EmployeesInterfaceService {

  @Autowired
  private EmployeesDAO EmployeesDAO;

  @Override
  @Transactional
  public void create(Employees employee) {
    EmployeesDAO.create(employee);
  }

  @Override
  public List<EmployeesDTO> findAll() {
    List<?> data = new ArrayList<>(EmployeesDAO.findAll());
    List<EmployeesDTO> employees = new ArrayList<>();
    EmployeesDTO employee = new EmployeesDTO();
    for (int i = 0; i < data.size(); i++) {
      Object get = data.get(i);    
    }

    return EmployeesDAO.findAll();
  }

  @Override
  public String generateEmail(String email) {
    String[] partsEmail = email.split("@");
    String emailFound = EmployeesDAO.generateEmail(partsEmail[0], partsEmail[1]);
    if (emailFound.equals("No Result") || emailFound.equals("")) {
      return email;
    }
    partsEmail = emailFound.split("@");
    //get numerical sequence of email
    String numberForEmail = partsEmail[0].replaceAll("\\D+", "");
    if (!numberForEmail.isEmpty()) {
      Integer cont = Integer.parseInt(numberForEmail) + 1;
      //create new email
      email = partsEmail[0].replace(numberForEmail, "" + String.valueOf(cont)) + "@" + partsEmail[1];
    } else {
      email = partsEmail[0] + ".1" + "@" + partsEmail[1];
    }
    return email;

  }

  @Override
  public Boolean findByIdentifNumAndIdentifType(String identifNumber, Integer identifType) {
    return EmployeesDAO.findByIdentifNumAndIdentifType(identifNumber, identifType);
  }

}
