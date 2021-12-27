package com.cg.jpaCRUD.client;

import java.util.Scanner;

import com.cg.jpaCRUD.entities.Student;
import com.cg.jpaCRUD.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args) 
	{
		StudentServiceImpl service = new StudentServiceImpl();
		Student student = new Student();
		
		
		//Create operation
		student.setName("Nandan G N");
		student.setStudentid(1);
		service.addStudent(student);
		
		
		
		//Retrive Operation
		student = service.findStudentById(1);
		System.out.println("Student ID is: "+student.getStudentid());
		System.out.println("Student Name is: "+student.getName());

		//Update Operation
		student = service.findStudentById(1);
		student.setName("NANDAN G N");
		System.out.println("Student Name is: "+student.getName());
		
		Scanner scan = new Scanner(System.in);
		String input;
		System.out.print("Do you want to delete a record Say 'yes' or 'no': ");
		input = scan.next();
		
		
		if(input == "yes" || input == "Yes")
		{
			//Delete operation
			student = service.findStudentById(1);
			service.removeStudent(student);
			System.out.println("Delete Operation Completed");
		}
		else
		{
			System.out.println("End of the CRUD Operation");
		}
		
	}

}
