package com.cg.jpaCRUD.dao;

import javax.persistence.EntityManager;

import com.cg.jpaCRUD.entities.Student;

//implementation method 
public class StudentDaoImpl
{
	
	private EntityManager entityManager;
	
	public StudentDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	//adding body to the abstract methods of StudentDao
	
	//public abstract Student getStudentById(int id);
	public Student getStudentById(int id) 
	{
		Student student = entityManager.find(Student.class, id);
		return student;
	}
	
	//public abstract void addStudent(Student student);
	public void addStudent(Student student)
	{
		entityManager.persist(student);
	}
	
	//public abstract void removeStudent(Student student);
	public void removeStudent(Student student)
	{
		entityManager.remove(student);
	}
	
	//public abstract void updateStudent(Student student);
	public void updateStudent(Student student)
	{
		entityManager.merge(student);
	}
	
	
	//	public abstract void beginTransaction();
	public void beginTransaction()
	{
		entityManager.getTransaction().begin();
	}

	//public abstract void commitTransaction();
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}
}
