package com.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//ici, on a implémenté le Design Pattern : Singleton
public class SessionBuilder {
	private static EntityManagerFactory sessionFactory;

	private SessionBuilder() {
	}

	public static EntityManagerFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = Persistence.createEntityManagerFactory("db");
		return sessionFactory;
	}

}
