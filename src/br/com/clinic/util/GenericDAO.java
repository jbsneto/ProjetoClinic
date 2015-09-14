/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinic.util;

import br.com.clinic.interfac.Base;
import br.com.clinic.interfac.IDAOGeneric;
import java.lang.reflect.Field;
import java.util.List;
import javax.persistence.Id;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class GenericDAO<T extends Base> implements IDAOGeneric<T> {

    private Class classModel;
    private Session sessao;
    private Transaction trans;

    public GenericDAO(Class<T> classModel) {
        this.classModel = classModel;
    }

    @Override
    public void create(T objeto) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        try {
            if (objeto.getId() == null) {
                sessao.getTransaction().begin();
                sessao.persist(objeto);
                sessao.getTransaction().commit();
                System.out.println(MensagensUtil.getValor(MensagensUtil.SUCESSO_SALVAR));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
            System.out.println(MensagensUtil.getValor(MensagensUtil.ERRO_SALVAR));
        } finally {
            sessao.close();
        }
    }

    @Override
    public void update(T objeto) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            sessao.update(objeto);
            sessao.getTransaction().commit();
            System.out.println(MensagensUtil.getValor(MensagensUtil.SUCESSO_EDITAR));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
            System.out.println(MensagensUtil.getValor(MensagensUtil.ERRO_EDITAR));
        } finally {
            sessao.close();
        }
    }

    @Override
    public void delete(T objeto) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            sessao.delete(objeto);
            sessao.getTransaction().commit();
            System.out.println(MensagensUtil.getValor(MensagensUtil.SUCESSO_DELETAR));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
            System.out.println(MensagensUtil.getValor(MensagensUtil.DESEJA_DELETAR));
        } finally {
            sessao.close();
        }
    }

    @Override
    public T getId(Long id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            Criteria criteria = sessao.createCriteria(classModel);
            //criteria.add(Restrictions.eq("id", id));
            for (Field field : classModel.getDeclaredFields()) {
                if ((field.getAnnotation(Id.class)) != null) {
                    criteria.add(Restrictions.eq(field.getName(), id));
                }
            }
            return (T) criteria.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
            System.out.println(MensagensUtil.getValor(MensagensUtil.ERRO_CONSULTAR_ID));
        } finally {
            sessao.close();
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        try {
            sessao.getTransaction().begin();
            Criteria criteria = sessao.createCriteria(classModel);
            return (List<T>) criteria.list();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
            System.out.println(MensagensUtil.getValor(MensagensUtil.ERRO_CONSULTAR));
        } finally {
            sessao.close();
        }
        return null;
    }

}
