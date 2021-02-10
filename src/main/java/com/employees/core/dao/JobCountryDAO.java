/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.dao;

import com.employees.core.entities.JobCountry;
import java.util.List;

/**
 *
 * @author JEREMY
 */
public interface JobCountryDAO {

  /**
   * Metodo para listar los paises donde se realiza el trabajo
   *
   * @return JobCountry
   */
  List<JobCountry> findAll();
}
