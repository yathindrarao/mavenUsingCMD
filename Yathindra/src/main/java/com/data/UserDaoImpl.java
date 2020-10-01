package com.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;


import com.service.User;

public class UserDaoImpl implements UserDao {
	private static EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("Yathindra");
	@Override
	public String addNewUser(User username) throws PersistenceException {
		EntityManager entityManager=null;
		try {
			entityManager=emf.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(username);
			entityManager.getTransaction().commit();			
			
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}finally {
			entityManager.close();
		}
		return null;

	
	}

	@Override
	public String addNewPassword(User password) throws PersistenceException {
		
		EntityManager entityManager=null;
		try {
			entityManager=emf.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(password);
			entityManager.getTransaction().commit();			
			
		}catch(PersistenceException e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			throw e;
		}finally {
			entityManager.close();
		}
		return null;

	
	}
	}

	
