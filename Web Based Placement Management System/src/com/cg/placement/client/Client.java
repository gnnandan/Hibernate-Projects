package com.cg.placement.client;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.entities.Student;
import com.cg.placement.entities.User;
import com.cg.placement.service.ICertificateServiceImpl;
import com.cg.placement.service.ICollegeServiceImpl;
import com.cg.placement.service.IPlacementServiceImpl;
import com.cg.placement.service.IUserServiceImpl;
import com.cg.placement.service.StudentServiceImpl;

public class Client 
{

	public static void main(String[] args)
	{
		// CRUD operation calling activity
		
		
		Student student = new Student();//student class
		Certificate certificate = new Certificate();//certificate class
		User user = new User();//user class
		College college = new College();
		Placement placement = new Placement();
		
		StudentServiceImpl service = new StudentServiceImpl();
		ICertificateServiceImpl cer_service = new ICertificateServiceImpl();
		IUserServiceImpl usr_service = new IUserServiceImpl();
		ICollegeServiceImpl clg_service = new ICollegeServiceImpl();
		IPlacementServiceImpl p_service = new IPlacementServiceImpl();
		
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


		//create a user

		 user.setUser_id(1); 
		 user.setName("Nandan");
		 user.setType("Regular");
		 user.setPassword("1234567");
		 System.out.println("User added successfully...!");
		 
		
		//create a college
		
		 college.setCollege_id(1); 
		 college.setCollege_name("KIT");
		 college.setCollege_location("Tiptur");
		 System.out.println("College added successfully...!");
		 
		
		//create a placement
		placement.setPlacement_id(1);
		placement.setName("KIT Placements 2021");
		placement.setLocalDate("12/07/2021");
		placement.setQualification("BE");
		placement.setYear(2021);
		System.out.println("Placement details added successfully...!");
		
		//one to one (writing data to database in one to one mapping)
		/*
		 * student.setCertificate(certificate); 
		 * certificate.setStudent(student);
		 */
		
		
		//service instance is used add data into database
		
		 service.addStudent(student); 
		 cer_service.addCertificate(certificate);
		 usr_service.addUser(user);
		 clg_service.addCollege(college);
		 p_service.addPlacement(placement);
		
		

		//Retrieve
		student = service.searchStudentById(1);
		System.out.println("ID is: " + student.getId());
		System.out.println("Name is: " + student.getName());
		System.out.println("Roll is:"+student.getRoll());
		System.out.println("College is:"+student.getCollege());
		
		//update
		/*
		 * student = service.searchStudentById(1);
		 * student.setCollege("Kalpataru Institute Of Technology");
		 * service.updateStudent(student); 
		 * System.out.println("Update is successful");
		 */

		//delete
		/*
		 * student = service.searchStudentById(1); 
		 * service.deleteStudent(student);
		 * System.out.println("Delete is successful");
		 */
	}

}
