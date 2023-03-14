package com.gl.labproject.ITsupport.application;
import com.gl.labproject.ITsupport.employee.Employee;
import com.gl.labproject.ITsupport.service.CredentialService;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//department
		String department = "";
		
		
		//first name printing
		System.out.println("Enter your First Name : ");
		String firstName = input.nextLine();
		
		//last name printing
		System.out.println("Enter your Last Name : ");
		String lastName = input.nextLine();
		
		Employee emp = new Employee(firstName,lastName);
	
		
		System.out.println("Please Enter the Department from the following \n");
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = input.nextInt();
		
		switch (option) {
		case 1 : {
			department = "tech";
			break;
		}
		case 2 : {
			department = "admin";
			break;
		}
		case 3 : {
			department = "hr";
			break;
		}
		case 4 : {
			department = "legal";
			break;
		}
		default : {
			
			System.out.println("wrong input....");
			
		}
		
		}
			
		if(option>0 && option<=4 ) {
			CredentialService cred = new CredentialService();
			String newEmail = cred.generateEmailAddress(emp,department);
			emp.setEmployeeEmail(newEmail);
			String password = cred.generatePassword();
			emp.setEmployeePassword(password);
			cred.showCredentials(emp,department);	
		}
		input.close();
	}
	

}
