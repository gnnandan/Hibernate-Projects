package com.cg.placement.repository;

import com.cg.placement.entities.Placement;

public interface IPlacementRepository 
{
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacement(int placement_id);
	public Placement cancelPlacement(int placement_id);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	
}
