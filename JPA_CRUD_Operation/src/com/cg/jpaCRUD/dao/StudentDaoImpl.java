package com.cg.jpaCRUD.dao;

import javax.persistence.EntityManager;

import com.cg.jpaCRUD.entities.Student;

public class StudentDaoImpl 
{
	private EntityManager entityManager;
	
	public StudentDaoImpl()
	{
		//reference variable  = classname.methodname();
		entityManager = JPAUtil.getEntityManager();
	}
	
	//we need to give body to the abstract methods 
	public Student getStudentById(int id) 
	{
		Student student = entityManager.find(Student.class, id);
		return student;
	}
	
	//adding the student
	public void addStudent(Student student)
	{
		entityManager.persist(student);
	}
	
	//removing the student
	public void removeStudent(Student student)
	{
		entityManager.remove(student);
	}
	
	//update student
	public void updateStudent(Student student)
	{
		entityManager.merge(student);
	}
	
	//commit Transaction
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}
	
	//begin Transaction
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
	}
	
}
