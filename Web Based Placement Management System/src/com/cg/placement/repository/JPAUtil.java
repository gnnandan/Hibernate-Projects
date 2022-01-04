package com.cg.placement.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil
{
	//to start JPA life cycle
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	//static block
	static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager()
	{
		if(entityManager == null ||!entityManager.isOpen())
		{
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
}
