/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.dao;

import com.employees.core.entities.IdentityDocumentType;
import java.util.List;

/**
 *
 * @author JEREMY
 */
public interface IdenDocTypeDAO {

  /**
   * Metodo para listar los tipos de documento
   *
   * @return IdentityDocumentType
   */
  List<IdentityDocumentType> findAll();
}
