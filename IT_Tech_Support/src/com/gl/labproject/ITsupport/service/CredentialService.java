package com.gl.labproject.ITsupport.service;
import java.util.Random;
import com.gl.labproject.ITsupport.employee.Employee;

public class CredentialService {

	String company = ".infosys.com";

	public String generateEmailAddress(Employee emp1, String dept) {

		String email = emp1.getEmployeeFirstName() + emp1.getEmployeeLastName() + "@" + dept + company ;
		return email.toLowerCase();
	}

	public String generatePassword() {
		
		Random rn = new Random();
	String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
	String lower_case = "qwertyuiopasdfghjklzxcvbnm";
	String symbol = "!@#$%^&*";
	String digits = "0123456789";
	
	String password = "";
	
	int index ;
	
	index = rn.nextInt(26);
	password +=  upper_case.charAt(index);
	index = rn.nextInt(26);
	password +=  upper_case.charAt(index);
	
	index = rn.nextInt(8);
	password +=  symbol.charAt(index);
	
	index = rn.nextInt(26);
	password +=  lower_case.charAt(index);
	index = rn.nextInt(26);
	password +=  lower_case.charAt(index);
	
	index = rn.nextInt(10);
	password +=  digits.charAt(index);
	index = rn.nextInt(10);
	password +=  digits.charAt(index);
	index = rn.nextInt(10);
	password +=  digits.charAt(index);
	
	
 return password;
	}

	
	public void showCredentials(Employee emp, String dept) {
		System.out.println("Dear " + emp.getEmployeeFirstName() + " your generated credentials are as follows...");
		 
		System.out.println("Email --->" + emp.getEmployeeEmail());
		System.out.println("Password --->" + emp.getEmployeePassword());

	}
}
