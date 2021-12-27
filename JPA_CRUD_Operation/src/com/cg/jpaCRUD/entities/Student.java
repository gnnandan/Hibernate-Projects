package com.cg.jpaCRUD.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //creating entity
@Table(name = "students") //mapping to the table students

public class Student implements Serializable //at last implement Serializable to make restriction except variables, constructors and getters and setters
{
	private static final long serialVersionUID=1L;//version of Serializable
	
	@Id //when ever we have a primary key we use annotation id 
	private int studentid;
	private String name;
	
	//create a getters and setters for the properties (columns)
	public int getStudentid() 
	{
		return studentid;
	}
	public void setStudentid(int studentid)
	{
		this.studentid = studentid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
}
