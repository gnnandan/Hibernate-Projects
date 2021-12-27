package com.cg.JPAJoinInheritance.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_database")

public class Manager extends Employee
{

	private static final long serialVersionUID = 1L;
	
	//table name in database
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}
	
}
