package com.cg.placement.repository;

import com.cg.placement.entities.User;

public interface IUserRepository 
{
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(User user);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();

}
