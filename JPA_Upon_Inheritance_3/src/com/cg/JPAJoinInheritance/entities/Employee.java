package com.cg.JPAJoinInheritance.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "emp_database")
@Inheritance(strategy = InheritanceType.JOINED)


public class Employee implements Serializable
{
	private static final long SerialVersionUID = 1L;
	
	@Id
	private int employeeID;
	private String name;
	private double salary;
	
	
	//getters and setters
	public int getEmployeeID() 
	{
		return employeeID;
	}
	public void setEmployeeID(int employeeID) 
	{
		this.employeeID = employeeID;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	
	
	
	
}
