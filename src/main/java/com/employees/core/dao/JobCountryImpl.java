/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.dao;

import com.employees.core.entities.JobCountry;
import com.employees.core.exceptions.ComponentJobCountryException;
import com.employees.core.exceptions.ExceptionNumberEnum;
import com.sogesac.core.log.EMLogger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class JobCountryImpl implements JobCountryDAO {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public List<JobCountry> findAll() {
    try {
      javax.persistence.criteria.CriteriaQuery cq = sessionFactory.getCurrentSession().getCriteriaBuilder().createQuery();
      cq.select(cq.from(JobCountry.class));

      List<JobCountry> result = sessionFactory.getCurrentSession().createQuery(cq).getResultList();
      return result;
    } catch (HibernateException e) {
      try {
        EMLogger.log.error("Error consulting job countries", e);
        throw new ComponentJobCountryException(ExceptionNumberEnum.ERROR_UNDEFINED, e);
      } catch (ComponentJobCountryException ex) {
        Logger.getLogger(JobCountryImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    return null;
  }

}
