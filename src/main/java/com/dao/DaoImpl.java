package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.beans.Utilisateur;


public class DaoImpl implements IDao {
	private EntityManager session;
	private EntityTransaction tx;

	@Override
	public void save(Utilisateur p) {
		try {
			session = SessionBuilder.getSessionFactory().createEntityManager();
			tx = session.getTransaction();
			tx.begin();
			session.merge(p);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

	@Override
	public List<Utilisateur> getAll() {
		List<Utilisateur> result = null;
		try {
			session = SessionBuilder.getSessionFactory().createEntityManager();
			result = session.createQuery("from Utilisateur").getResultList();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	@Override
	public void remove(Long id) {
		try {
			session = SessionBuilder.getSessionFactory().createEntityManager();
			tx = session.getTransaction();
			tx.begin();
			Utilisateur p = session.find(Utilisateur.class, id);
			if (p != null)
				session.remove(p);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

	@Override
	public Utilisateur getById(Long id) {
		Utilisateur result = null;
		try {
			session = SessionBuilder.getSessionFactory().createEntityManager();
			result = session.find(Utilisateur.class, id);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}
}
