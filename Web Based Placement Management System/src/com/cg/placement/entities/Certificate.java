package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "certificate")
public class Certificate 
{
	@Id
	public int id;
	public int year;
	public String college;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public String getCollege()
	{
		return college;
	}
	
	public void setCollege(String college)
	{
		this.college = college;
	}
}
