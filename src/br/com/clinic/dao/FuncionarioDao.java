/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.dao;

import br.com.clinic.model.Funcionario;
import br.com.clinic.model.Pessoa;
import br.com.clinic.util.GenericDAO;
import br.com.clinic.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author GENPAC
 */
public class FuncionarioDao extends GenericDAO<Funcionario>{

     public FuncionarioDao(Class<Funcionario> classModel) {
        super(classModel);
    }
   
    public Funcionario getIdFuncionario(Long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Pessoa.class);
		criteria.add(Restrictions.eq("id", id));
		Funcionario p = (Funcionario) criteria.uniqueResult();
		session.close();
		return p;
    }
    
    public Funcionario getLoginFuncionario(String login) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Pessoa.class);
		criteria.add(Restrictions.eq("login", login));
		Funcionario p = (Funcionario) criteria.uniqueResult();
		session.close();
		return p;
    }
    
}