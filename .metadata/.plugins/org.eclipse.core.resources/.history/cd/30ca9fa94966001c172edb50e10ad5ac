package com.cg.jpaCRUD.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 
{
	//we need EntityManagerFactory and EntityManagern to start a JPA Life Cycle
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	//we need to invoke Persistence to createEntityManagorFactory
	static 
	{
		factory  = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager() 
	{
		if(entityManager == null || !entityManager.isOpen())
		{
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
}
