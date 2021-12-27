/**
 * 
 */
package com.cg.jpaCRUD.dao;

import com.cg.jpaCRUD.entities.Student;

/**
 * @author NANDANGN
 *
 */
public interface StudentDao 
{
	//An interface is an abstract method but it does'nt have body {Senior Developer Do This}
	//CRUD Operation Methods
	public abstract Student getStudentById(int id);

	public abstract void addStudent(Student student);

	public abstract void removeStudent(Student student);

	public abstract void updateStudent(Student student);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();
}
