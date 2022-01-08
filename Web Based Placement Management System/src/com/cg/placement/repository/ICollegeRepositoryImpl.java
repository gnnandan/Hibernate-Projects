package com.cg.placement.repository;

import javax.persistence.EntityManager;
import com.cg.placement.entities.College;

public class ICollegeRepositoryImpl implements ICollegeRepository
{
	//Step-1 Begin JPA Life Cycle
	private EntityManager entityManager;
	public ICollegeRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}
	
	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}
	
	@Override
	public College searchCollege(int college_id) {
		College college = entityManager.find(College.class, college_id);
		return college;
	}
	
	@Override
	public College deleteCollege(int college_id) {
		College college = entityManager.find(College.class, college_id);
		entityManager.remove(college);
		return college;
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
