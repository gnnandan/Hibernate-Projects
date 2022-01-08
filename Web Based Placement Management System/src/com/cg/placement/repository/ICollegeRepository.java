package com.cg.placement.repository;

import com.cg.placement.entities.College;

public interface ICollegeRepository
{
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(int college_id);
	public College deleteCollege(int college_id);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	
}
