package com.cg.jpaCRUD.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil
{
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	//it should be in static block 
	static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager()
	{
		// to check the entitymanager is null or connection open 
		if(entityManager == null || !entityManager.isOpen())
		{
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
}
