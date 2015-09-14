/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.dao;

import br.com.clinic.model.Exame;
import br.com.clinic.util.GenericDAO;
import br.com.clinic.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author GENPAC
 */
public class ExameDao extends GenericDAO<Exame> {

    public ExameDao(Class<Exame> classModel) {
        super(classModel);
    }
    
    public Exame getIdExame(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Exame.class);
        criteria.add(Restrictions.eq("id", id));
        Exame e = (Exame) criteria.uniqueResult();
        session.close();
        return e;
    }
}
