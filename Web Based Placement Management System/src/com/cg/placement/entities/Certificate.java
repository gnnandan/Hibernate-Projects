package com.cg.placement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificate_info")
public class Certificate 
{
	@Id
	@Column (name = "certificate_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	public int certificate_id;
	public int certificate_year;
	public String certificate_college;
	
	
	
	@OneToOne(mappedBy = "certificate")
	private Student student;

	public Student getStudent()
	{
		return student;
	}
	
	public void setStudent(Student student)
	{
		this.student = student;
	}

	//getters and setters
	public int getCertificate_id() {
		return certificate_id;
	}

	public void setCertificate_id(int certificate_id) {
		this.certificate_id = certificate_id;
	}

	public int getCertificate_year() {
		return certificate_year;
	}

	public void setCertificate_year(int certificate_year) {
		this.certificate_year = certificate_year;
	}

	public String getCertificate_college() {
		return certificate_college;
	}

	public void setCertificate_college(String certificate_college) {
		this.certificate_college = certificate_college;
	}
	
	
	
	
	
	
	
}
