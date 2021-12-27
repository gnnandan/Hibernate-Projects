package com.cg.JPADemoSingleLevelIneheritance.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//to select entire schema
@Entity

//value for manager row will have this value in Discriminator column
@DiscriminatorValue("Manager")

public class Manager extends Employee
{

	private static final long serialVersionUID = 1L;
	
	private String department;

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

}
