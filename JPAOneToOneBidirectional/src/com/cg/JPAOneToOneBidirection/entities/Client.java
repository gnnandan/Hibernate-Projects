package com.cg.JPAOneToOneBidirection.entities;

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
		student.setName("Nandan");
		
		Address pgAddress = new Address();
		pgAddress.setAddress_street("JP Nagar");
		pgAddress.setAddress_city("Bangalore");
		pgAddress.setAddress_street("JP Nager 5th Phase");
		pgAddress.setAddress_state("Karnataka");
		pgAddress.setAddress_zipcode("560078");
		
		//pass/ inject student details to address
		student.setAddress(pgAddress);
		
		
		manager.persist(student);
		
		
		manager.getTransaction().commit();
		
		System.out.println("Data added");
		manager.close();
		factory.close();
		
		
		
		
		
	}

}
