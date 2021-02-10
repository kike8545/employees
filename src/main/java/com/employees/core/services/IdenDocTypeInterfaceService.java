/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.services;

import com.employees.core.entities.IdentityDocumentType;
import java.util.List;

/**
 *
 * @author JEREMY
 */
public interface IdenDocTypeInterfaceService {

  List<IdentityDocumentType> findAll();
}
