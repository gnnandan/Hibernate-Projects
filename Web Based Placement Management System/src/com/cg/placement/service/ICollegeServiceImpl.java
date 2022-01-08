package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.repository.ICollegeRepository;
import com.cg.placement.repository.ICollegeRepositoryImpl;

public class ICollegeServiceImpl implements ICollegeService
{
	// Step 1: Establishing connection between Service and Repo
	private ICollegeRepository dao;
	
	public ICollegeServiceImpl() 
	{
		dao =  new ICollegeRepositoryImpl();
	}

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTrasaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTrasaction();
		return college;
	}

	@Override
	public College searchCollege(int college_id) {
		College college = dao.searchCollege(college_id);
		return college;
	}

	@Override
	public College deleteCollege(int college_id) {
		College college = dao.deleteCollege(college_id);
		return college;
	}
}
