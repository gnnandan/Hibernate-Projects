package com.cg.placement.repository;

import com.cg.placement.entities.Student;

public interface IStudentRepository
{
	//interfaces
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(int id);
	public Student searchStudentByHallTicket(int hallTicketNo);
	public Student deleteStudent(Student student);
	
	//add certificate class should be added here
	public Student addCertificate(Student student);
	public Student updateCertificate(Student student);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	public void deleteStudent(int id);
}
