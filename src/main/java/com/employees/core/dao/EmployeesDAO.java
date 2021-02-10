/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.dao;

import com.employees.core.dto.EmployeesDTO;
import com.employees.core.entities.Employees;
import java.util.List;

/**
 *
 * @author JEREMY
 */
public interface EmployeesDAO {

  /**
   * Metodo para crear un empleado
   *
   * @param employee
   */
  void create(Employees employee);

  /**
   * Metodo para listar todos los empleados
   *
   * @return List<>
   */
  List<EmployeesDTO> findAll();

  /**
   * Metodo para generar un mail
   *
   * @param email
   * @param domain
   * @return Boolean
   */
  String generateEmail(String email, String domain);

  /**
   * Metodo para buscar empleado porsu numero de identificacion y tipo
   *
   * @param identifNumber
   * @param identifType
   * @return Boolean
   */
  Boolean findByIdentifNumAndIdentifType(String identifNumber, Integer identifType);

}
