package com.cg.jpaCRUD.service;

import com.cg.jpaCRUD.dao.StudentDao;
import com.cg.jpaCRUD.dao.StudentDaoImpl;
import com.cg.jpaCRUD.entities.Student;

public class StudentServiceImpl 
{
	private StudentDaoImpl dao;

	public StudentServiceImpl() 
	{
		dao = new StudentDaoImpl();
	}


	public void addStudent(Student student) 
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}
	

	public void updateStudent(Student student) 
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}
	

	public void removeStudent(Student student) 
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}
	
	public Student findStudentById(int id) 
	{
		//no need of transaction, as it's an read/retrieve operation
		Student student  = dao.getStudentById(id);
		return student;
	}

}
