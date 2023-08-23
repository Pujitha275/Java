package com.jpa.hibernatejpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory em;
	private static final String PERSISTENCE_UNIT_NAME="JPADemo";//for creating a constant the letters should be capital and if its a combination of 2 or more words use_
	public static EntityManagerFactory getEntityManagerFactory() {
		if (em == null) {
			em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return em;
	}
	public static void shutdown() {
		if (em != null) {
			em.close();
		}
	}
	
}
