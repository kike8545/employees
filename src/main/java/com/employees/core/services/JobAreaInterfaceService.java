/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.services;

import com.employees.core.entities.JobArea;
import java.util.List;

/**
 *
 * @author JEREMY
 */
public interface JobAreaInterfaceService {

  List<JobArea> findAll();
}
