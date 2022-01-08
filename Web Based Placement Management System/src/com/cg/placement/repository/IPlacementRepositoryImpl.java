package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Placement;

public class IPlacementRepositoryImpl implements IPlacementRepository
{
	//Step-1 Begin JPA Life Cycle
	private EntityManager entityManager;
	public IPlacementRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	
	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}
	
	
	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}
	
	
	@Override
	public Placement searchPlacement(int placement_id) {
		Placement placement = entityManager.find(Placement.class,placement_id);
		return placement;
	}


	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}


	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
	}


	@Override
	public Placement cancelPlacement(int placement_id) {
		Placement placement = entityManager.find(Placement.class,placement_id);
		entityManager.remove(placement);
		return placement;
	}
}
