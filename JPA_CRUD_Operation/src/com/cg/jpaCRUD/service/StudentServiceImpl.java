package com.cg.jpaCRUD.service;

import com.cg.jpaCRUD.dao.StudentDaoImpl;
import com.cg.jpaCRUD.entities.Student;

public class StudentServiceImpl 
{
	private StudentDaoImpl dao ;
	
	public StudentServiceImpl()
	{
		dao = new StudentDaoImpl();
	}
	
	//for adding the student
	public void addStudent(Student student)
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}
	
	//for updating the student
	public void updateStudent(Student student) 
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}
	
	//for deleting the student
	public void removeStudent(Student student) 
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}
	
	//for retrieving the student
	public Student findStudentById(int id)
	{
		Student student = dao.getStudentById(id);
		return student;
	}
	

}
