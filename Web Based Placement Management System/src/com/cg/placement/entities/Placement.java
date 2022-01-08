package com.cg.placement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.DateType;

@Entity
@Table(name= "placement_info")
public class Placement 
{
	@Id
	@Column(name = "placement_id")
	private int placement_id;
	private String name;
	private String LocalDate;
	private String qualification;
	private int year;
//	private College college;
	
	//getters and setters
	public int getPlacement_id()
	{
		return placement_id;
	}
	
	public void setPlacement_id(int placement_id)
	{
		this.placement_id = placement_id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getLocalDate() 
	{
		return LocalDate;
	}
	
	public void setLocalDate(String LocalDate)
	{
		this.LocalDate = LocalDate;
	}
	
	public String getQualification()
	{
		return qualification;
	}
	
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
}
