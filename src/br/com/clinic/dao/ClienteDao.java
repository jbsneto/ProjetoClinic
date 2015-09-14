/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.dao;

import br.com.clinic.model.Cliente;
import br.com.clinic.model.Pessoa;
import br.com.clinic.util.GenericDAO;
import br.com.clinic.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author GenPac
 */
public class ClienteDao extends GenericDAO<Cliente>{

    public ClienteDao(Class<Cliente> classModel) {
        super(classModel);
    }
   
    public Cliente getIdCliente(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Pessoa.class);
		criteria.add(Restrictions.eq("id", id));
		Cliente p = (Cliente) criteria.uniqueResult();
		session.close();
		return p;
	}
}
