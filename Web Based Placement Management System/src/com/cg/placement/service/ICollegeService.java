package com.cg.placement.service;

import com.cg.placement.entities.College;

public interface ICollegeService 
{
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(int college_id);
	public College deleteCollege(int college_id);

}
