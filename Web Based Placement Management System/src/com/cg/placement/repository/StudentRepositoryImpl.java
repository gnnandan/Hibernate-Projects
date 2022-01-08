package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Student;
/**
 * 
 * @author NANDANGN
 * @Note
 * -------Use In Implementation--------
 * CREATION - USE PERSIST METHOD
 * UPDATE   - USE MERGE METHOD
 * IDENTIFY - FIND METHOD
 * DELETE   - REMOVE METHOD
 *
 */
public class StudentRepositoryImpl implements IStudentRepository
{
	//Step-1 Begin JPA Life Cycle
	private EntityManager entityManager;
	public StudentRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	//Step-2 create operation
	@Override
	public Student addStudent(Student student) 
	{
		entityManager.persist(student);
		return student;
	}
	
	//Step-3 update operation
	@Override
	public Student updateStudent(Student student) 
	{
		
		entityManager.merge(student);
		return student;
	}
	
	//Step-4 search operation
	@Override
	public Student searchStudentById(int id) 
	{
		
		Student student = entityManager.find(Student.class, id);
		return student;
	}
	
	//Step-5 search operation
	@Override
	public Student searchStudentByHallTicket(int hallTicketNo) 
	{
		Student student = entityManager.find(Student.class, hallTicketNo);
		return student;
	}
	
	//Step-6 delete operation
	@Override
	public Student deleteStudent(Student student) 
	{
		entityManager.remove(student);
		return student;
		
	}
	
	//Step-7 add operation
	@Override
	public Student addCertificate(Student student)
	{
		entityManager.persist(student);
		return student;
	}
	
	//Step-8 update operation
	@Override
	public Student updateCertificate(Student student)
	{
		entityManager.persist(student);
		return student;
	}
	
	//Step-9 begin Transaction
	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
	}
	
	//Step-10 Commit Transaction
	@Override
	public void commitTrasaction()
	{
		entityManager.getTransaction().commit();
		
	}
	
	//Step-11 delete operation by id
	@Override
	public void deleteStudent(int id)
	{
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
	}
}
