package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.User;

public class IUserRepositoryImpl implements IUserRepository
{
	//Step-1 Begin JPA Life Cycle
		private EntityManager entityManager;
		public IUserRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		
		@Override
		public User addUser(User user) {
			entityManager.persist(user);
			return user;
		}
		
		@Override
		public User updateUser(User user) {
			entityManager.merge(user);
			return user;
		}
		
		@Override
		public User deleteUser(User user) 
		{
			entityManager.remove(user);
			return user;
		}
		
		@Override
		public void beginTransaction() {
			entityManager.getTransaction().begin();
			
		}
		@Override
		public void commitTrasaction() {
			entityManager.getTransaction().commit();
			
		}
		
		
		
}
