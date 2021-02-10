/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.services;

import com.employees.core.dao.IdenDocTypeDAO;
import com.employees.core.entities.IdentityDocumentType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JEREMY
 */
@Service
public class IdenDocTypeService implements IdenDocTypeInterfaceService {

  @Autowired
  private IdenDocTypeDAO idenDocTypeDAO;

  @Override
  public List<IdentityDocumentType> findAll() {
    return idenDocTypeDAO.findAll();
  }

}
