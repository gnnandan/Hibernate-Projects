package com.cg.placement.service;

import com.cg.placement.entities.User;
import com.cg.placement.repository.IUserRepository;
import com.cg.placement.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService 
{
	private IUserRepository dao;
	public IUserServiceImpl() 
	{
		dao = new IUserRepositoryImpl();
	}
	
	
	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTrasaction();
		return user;
	}
	
	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTrasaction();
		return user;
	}
	
	@Override
	public User deleteUser(User user) {
		dao.beginTransaction();
		dao.deleteUser(user);
		dao.commitTrasaction();
		return user;
	}
	
	
	
}
