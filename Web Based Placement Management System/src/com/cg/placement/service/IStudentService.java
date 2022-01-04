package com.cg.placement.service;

import com.cg.placement.entities.Student;

public interface IStudentService 
{
	//adding 
	public Student addStudent(Student student);  
	
	//updating
	public Student updateStudent(Student student);  
	
	//searching - by id
	public Student searchStudentById(int id);  
	
	//searching - by Hall Ticket
	public Student searchStudentByHallTicket(int id); 
	
	//adding
	public Student addCertificate(Student student); 
	
	//updating
	public Student updateCertificate(Student student);
	
	//deleting
	public Student deleteStudent(Student student); 
}
