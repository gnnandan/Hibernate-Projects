package com.cg.JPAOneToOneBidirection.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int address_id;
	private String address_street;
	private String address_city;
	private String address_state;
	private String address_zipcode;
	
	
	//to create bi-directional relationship, use one to one with mappedBy 
	//mappedBy attribute indicates property name of owner i.e. Student class
	@OneToOne(mappedBy = "address")
	public int getAddress_id()
	{
		return address_id;
	}
	public void setAddress_id(int address_id)
	{
		this.address_id = address_id;
	}
	public String getAddress_street()
	{
		return address_street;
	}
	public void setAddress_street(String address_street)
	{
		this.address_street = address_street;
	}
	public String getAddress_city() 
	{
		return address_city;
	}
	public void setAddress_city(String address_city) 
	{
		this.address_city = address_city;
	}
	public String getAddress_state() 
	{
		return address_state;
	}
	public void setAddress_state(String address_state)
	{
		this.address_state = address_state;
	}
	public String getAddress_zipcode()
	{
		return address_zipcode;
	}
	public void setAddress_zipcode(String address_zipcode)
	{
		this.address_zipcode = address_zipcode;
	}	
}
