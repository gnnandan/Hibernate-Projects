package com.cg.jpaCRUD.dao;

import com.cg.jpaCRUD.entities.Student;

public interface StudentDao
{
	//we need to add abstract methods which is need to do CRUD Operation
	public abstract Student getStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);

	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
