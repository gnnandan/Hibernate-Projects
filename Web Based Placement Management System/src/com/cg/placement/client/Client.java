package com.cg.placement.client;

import com.cg.placement.entities.Student;
import com.cg.placement.service.StudentServiceImpl;

public class Client 
{

	public static void main(String[] args)
	{
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentServiceImpl service = new StudentServiceImpl();
		
		
		//Create student
		student.setId(1);
		student.setName("Nandan");
		student.setRoll(2);
		student.setQualification("Naveen");
		student.setCourse("CSE");
		student.setYear(2021);
		student.setCertificate("Cerified Python Level 1");
		student.setHallTicketNo(41);
		student.setCollege("VTU");
		service.addStudent(student);
		
		//Retrieve
		student = service.searchStudentById(1);
		System.out.println("ID is: " + student.getId());
		System.out.println("Name is: " + student.getName());
		System.out.println("Roll is:"+student.getRoll());
		System.out.println("College is:"+student.getCollege());
		
		
		//update
		student	= service.searchStudentById(1);
		student.setCollege("Kalpataru Institute Of Technology");
		service.updateStudent(student);
		System.out.println("Update is successful");

		//delete
//		student	= service.searchStudentById(1);
//		service.deleteStudent(student);
//		System.out.println("Delete is successful");
	}

}
