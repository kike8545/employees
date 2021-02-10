/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.services;

import com.employees.core.dto.EmployeesDTO;
import com.employees.core.entities.Employees;
import java.util.List;

/**
 *
 * @author JEREMY
 */
public interface EmployeesInterfaceService {

  void create(Employees employee);

  List<EmployeesDTO> findAll();

  String generateEmail(String email);
  
  Boolean findByIdentifNumAndIdentifType(String identifNumber, Integer identifType);

}
