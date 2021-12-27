package com.cg.JPAOneToOneUnidirection.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client
{

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		
		Student student = new Student();
		student.setName("Nandan G N");
		
		Address homeAddress = new Address();
		homeAddress.setStreet("Govinapura");
		homeAddress.setCity("Tiptur");
		homeAddress.setState("Karnataka");
		homeAddress.setZipcode("572201");
		
		//inject address into student table 
		student.setAddress(homeAddress);
		
		manager.persist(student);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		
		

	}

}
