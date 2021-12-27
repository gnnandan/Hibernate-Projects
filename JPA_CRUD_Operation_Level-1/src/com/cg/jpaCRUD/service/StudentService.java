package com.cg.jpaCRUD.service;

import com.cg.jpaCRUD.entities.Student;

public interface StudentService 
{
	//CRUD Operations
	public abstract void addStudent(Student student);

	public abstract void updateStudent(Student student);

	public abstract void removeStudent(Student student);

	
	public abstract Student findStudentById(int id);
}
