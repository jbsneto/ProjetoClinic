/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.dao;

import br.com.clinic.model.CidadeEstado;
import br.com.clinic.model.Cliente;
import br.com.clinic.model.Pessoa;
import br.com.clinic.util.GenericDAO;
import br.com.clinic.util.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author GENPAC
 */
public class CidadeEstadoDao extends GenericDAO<CidadeEstado>{

     public CidadeEstadoDao(Class<CidadeEstado> classModel) {
        super(classModel);
    }
     
    public CidadeEstado getCodCidade(String s) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(CidadeEstado.class);
            criteria.add(Restrictions.eq("codCidade", s));
            CidadeEstado ce = (CidadeEstado) criteria.uniqueResult();
            session.close();
            return ce;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e.getMessage());
            return null;
        }
    }

}
