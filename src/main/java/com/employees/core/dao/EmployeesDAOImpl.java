/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.dao;

import com.employees.core.dto.EmployeesDTO;
import com.employees.core.entities.Employees;
import com.employees.core.exceptions.ComponentEmployeeException;
import com.employees.core.exceptions.ExceptionNumberEnum;
import com.sogesac.core.log.EMLogger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JEREMY
 */
@Repository
@Transactional
public class EmployeesDAOImpl implements EmployeesDAO {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public void create(Employees employee) {
    try {
      sessionFactory.getCurrentSession().save(employee);
    } catch (HibernateException e) {
      try {
        EMLogger.log.error("Error saving employee", e);
        throw new ComponentEmployeeException(ExceptionNumberEnum.ERROR_ALMACENANDO_EMPLOYEE, e);
      } catch (ComponentEmployeeException ex) {
        Logger.getLogger(EmployeesDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  @Override
  public List<EmployeesDTO> findAll() {
    try {
      String sql = "SELECT "
              + "employees.id, "
              + "employees.first_name, "
              + "employees.other_name, "
              + "employees.last_name, "
              + "employees.second_name, "
              + "employees.id_identity_document_type, "
              + "identity_document_type.name, "
              + "employees.identification, "
              + "employees.id_job_country, "
              + "job_country.country, "
              + "employees.email, "
              + "employees.state "
              + "FROM "
              + "employees "
              + "INNER JOIN "
              + "identity_document_type ON employees.id_identity_document_type=identity_document_type.id "
              + "INNER JOIN "
              + "job_country ON  employees.id_job_country=job_country.id";

      List<EmployeesDTO> employee = (List<EmployeesDTO>) sessionFactory.getCurrentSession().createSQLQuery(sql)
              .getResultList();
      return employee;

    } catch (HibernateException e) {
      try {
        EMLogger.log.error("Error consulting employees", e);
        throw new ComponentEmployeeException(ExceptionNumberEnum.ERROR_UNDEFINED, e);

      } catch (ComponentEmployeeException ex) {
        Logger.getLogger(EmployeesDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    return null;
  }

  @Override
  public Boolean findByIdentifNumAndIdentifType(String identifNumber, Integer identifType) {
    try {
      String sql = "SELECT * FROM employees "
              + "WHERE employees.identification = '" + identifNumber + "' "
              + "AND employees.id_identity_document_type = " + identifType;

      Employees employee = (Employees) sessionFactory.getCurrentSession().createSQLQuery(sql)
              .addEntity(Employees.class).getSingleResult();
      return true;

    } catch (NoResultException e) {

      return false;

    } catch (HibernateException e) {
      try {
        EMLogger.log.error("Error consulting employees", e);
        throw new ComponentEmployeeException(ExceptionNumberEnum.ERROR_UNDEFINED, e);

      } catch (ComponentEmployeeException ex) {
        Logger.getLogger(EmployeesDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    return null;
  }

  @Override
  public String generateEmail(String email, String domain) {
    try {
      String sql = "SELECT * FROM employees WHERE employees.email LIKE '%" + email + "%@" + domain + "' ORDER BY employees.id DESC";

      List<Employees> data = sessionFactory.getCurrentSession().createSQLQuery(sql)
              .addEntity(Employees.class).getResultList();
      if (data.isEmpty()) {
        return "No Result";
      }
      return data.get(0).getEmail();

    } catch (HibernateException e) {
      try {
        EMLogger.log.error("Error consulting employees", e);
        throw new ComponentEmployeeException(ExceptionNumberEnum.ERROR_UNDEFINED, e);

      } catch (ComponentEmployeeException ex) {
        Logger.getLogger(EmployeesDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    return null;
  }

}
