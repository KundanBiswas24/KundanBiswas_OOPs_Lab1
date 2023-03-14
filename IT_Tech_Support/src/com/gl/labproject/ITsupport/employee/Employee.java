package com.gl.labproject.ITsupport.employee;

public class Employee {
	
	private String employeeFirstName ;
	private String employeeLastName;
	private String employeeEmail;
	private String employeePassword;
	
	public Employee(String employeeFirstName, String employeeLastName) {
	
	
		super();
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		
	}
	
	
    // getter and setter for employee first name 
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	
	
	
   // getter and setter for employee last name
	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	
	
	
   // getter and setter for employee email
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	
	
	
	// getter and setter for employee password
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	
	
}
