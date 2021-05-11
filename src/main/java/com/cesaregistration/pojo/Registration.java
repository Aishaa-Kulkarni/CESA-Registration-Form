package com.cesaregistration.pojo;

public class Registration {

	private String studentName,rollNo,department,year,ID;

	public Registration(String studentName, String rollNo, String department, String year) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.department = department;
		this.year = year;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	
}
