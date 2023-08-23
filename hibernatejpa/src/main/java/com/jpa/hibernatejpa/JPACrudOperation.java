package com.jpa.hibernatejpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class JPACrudOperation {
	
public void insertRecord(EmployeeEx e) {
	EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	em.persist(e);
	em.getTransaction().commit();
	em.clear();

	System.out.println("Record Inserted");
}
public void deleteRecord(int id) {
		EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		EmployeeEx e = em.find(EmployeeEx.class, id);
		em.remove(e);
		em.getTransaction().commit();
		em.clear();
		System.out.println("Record deleted");
}
public void findRecordById(int id) {
			EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			EmployeeEx e = em.find(EmployeeEx.class, id);
			System.out.println(+e.getId()+" " + e.getEname()+" " + e.getEdep());
			em.getTransaction().commit();
			em.clear();
			System.out.println("Record Successfully fetch from database");
		}
public void updateRecordById(int id,String name,String Edep) {
			EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			EmployeeEx e = em.find(EmployeeEx.class, id);
			e.setEdep(Edep);
			e.setEname(name);
			em.getTransaction().commit();
			em.clear();
			System.out.println("Record Updated Successfully from database");
		}
public void RetriveAll() {
	EntityManager em=JpaUtil.getEntityManagerFactory().createEntityManager();
	em.getTransaction().begin();
	List<EmployeeEx> elist= new ArrayList<EmployeeEx>();
	elist= em.createQuery("from EmployeeEx").getResultList();
	for(EmployeeEx e: elist) {
		System.out.println(+e.getId()+" " + e.getEname()+" " + e.getEdep());
	}
	em.getTransaction().commit();
	em.clear();
	System.out.println("Record Retrived");
}
}
