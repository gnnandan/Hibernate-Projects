package com.cg.placement.client;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;
import com.cg.placement.service.ICertificateServiceImpl;
import com.cg.placement.service.StudentServiceImpl;

public class Client 
{

	public static void main(String[] args)
	{
		// CRUD operation calling activity
		//student class
		Student student = new Student();
		
		//certificate class
		Certificate certificate = new Certificate();
		
		StudentServiceImpl service = new StudentServiceImpl();
		ICertificateServiceImpl cer_service = new ICertificateServiceImpl();
		
		//Create student
		student.setId(1);
		student.setName("Nandan");
		student.setRoll(1);
		student.setQualification("BE");
		student.setCourse("CSE");
		student.setCollege("KIT");
		student.setYear(2021);
		student.setHallTicketNo(41);
		
		
		
		//create a certificate
		certificate.setCertificate_id(101);
		certificate.setCertificate_year(2020);
		certificate.setCertificate_college("KIT");
		
		//one to one (writing data to database in one to one mapping)
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		service.addStudent(student);
		cer_service.addCertificate(certificate);
		
		
		//Retrieve
		student = service.searchStudentById(1);
		System.out.println("ID is: " + student.getId());
		System.out.println("Name is: " + student.getName());
		System.out.println("Roll is:"+student.getRoll());
		System.out.println("College is:"+student.getCollege());
		
		
		//update
//		student	= service.searchStudentById(1);
//		student.setCollege("Kalpataru Institute Of Technology");
//		service.updateStudent(student);
//		System.out.println("Update is successful");

		//delete
//		student	= service.searchStudentById(1);
//		service.deleteStudent(student);
//		System.out.println("Delete is successful");
	}

}
