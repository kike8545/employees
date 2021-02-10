/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.services;

import com.employees.core.dao.JobCountryDAO;
import com.employees.core.entities.JobCountry;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JEREMY
 */
@Service
public class JobCountryService implements JobCountryInterfaceService {

  @Autowired
  private JobCountryDAO jobCountryDAO;

  @Override
  public List<JobCountry> findAll() {
    return jobCountryDAO.findAll();
  }

}
