package com.cg.JPAClassPerTable.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main_Client
{

	public static void main(String[] args)
	{
		
		//EntityManagerFactory and EntityManager to bring JPA Life cycle 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		
		//begin transaction
		manager.getTransaction().begin();
		
		
		//creating reference for Employee class
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp.setEmployeeID(1);
		emp.setName("Nandan G N");
		emp.setSalary(500000);
		manager.persist(emp);
		
		emp1.setEmployeeID(3);
		emp1.setName("Karan Kumar");
		emp1.setSalary(600000);
		manager.persist(emp1);
		
		
		//creating reference for Manager class
		Manager mgr = new Manager();
		Manager mgr1 = new Manager();
		Manager mgr2 = new Manager();
		mgr.setEmployeeID(2);
		mgr.setName("Govardhan Javaram Sir");
		mgr.setDepartment("CEO");
		mgr.setSalary(1000000);
		manager.persist(mgr);
		
		mgr1.setEmployeeID(4);
		mgr1.setName("Sudharshan");
		mgr1.setDepartment("Admin");
		mgr1.setSalary(400000);
		manager.persist(mgr1);
		
		mgr2.setEmployeeID(5);
		mgr2.setName("Sharmila");
		mgr2.setDepartment("Human Resource");
		mgr2.setSalary(400000);
		manager.persist(mgr2);
		
		//commit transaction
		manager.getTransaction().commit();
		
		System.out.println("Data successfully added into seperate table 'Employee' and 'Manager'");
		
		//close EntityManagerFactory and EntityManager
		manager.close();
		factory.close();
	}

}
