package com.cg.placement.service;

import com.cg.placement.entities.Placement;
import com.cg.placement.repository.IPlacementRepository;
import com.cg.placement.repository.IPlacementRepositoryImpl;

public class IPlacementServiceImpl implements IPlacementService
{
	
	private IPlacementRepository dao;
	
	public IPlacementServiceImpl()
	{
		dao = new IPlacementRepositoryImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTrasaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int placement_id) {
		Placement placement = dao.searchPlacement(placement_id);
		return placement;
	}

	@Override
	public Placement cancelPlacement(int placement_id)
	{
		Placement placement = dao.searchPlacement(placement_id);
		dao.cancelPlacement(placement_id);
		return placement;
		
	}
}
