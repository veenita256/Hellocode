package com;

import java.util.Scanner;

import customexception.InvalidChoiceException;

public class SolutionEmp {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	
	EmployeeManagementSystem emp=new EmployeeImp();

	while(true) {
	System.out.println("->WELCOME TO EMPLOYEE DATABASE MANAGEMENT SYSTEM<-");
	System.out.println("--------------------------------------------------");
	System.out.println("1.Add Employee\n2.Display Employee\n3.Display All Employee");
	System.out.println("4.Remove Employee\n5.Remove All Employee\n6.Update Employee");
	System.out.println("7.Count Employee\n8.Sort Employee\n9.Get Employee By Lowest salary");
	System.out.println("10.Get Employee By Highest salary\n11.Exit");
	System.out.println("...................................................");
	System.out.println("I am Here to Help U, Please Enter Your Choice Here:");
	System.out.println("........");
	int choice=ip.nextInt();
	
	switch(choice) {
	
	case 1:
		emp.addEmployee();
		break;
	case 2: emp.displayEmployee();
	break;
	
	case 3: emp.displayAllEmployee();
	break;
	
	case 4: emp.removeEmployee();
	break;
	
	case 5: emp.removeAllEmployee();
	break;
	
	case 6: emp.updateEmployee();
	break;
	
	case 7: emp.countEmployee();
	break;
	
	case 8: emp.sortEmployee();
	break;
	
	case 9: emp.getEmployeeWithMiniSalary();
	break;
	
	case 10: emp.getEmployeeWithMaxSalary();
	break;
	
	case 11: 
    System.out.println("Thank You!");
    System.exit(0);
   
   default:
	   try {
		   String msg="Invalid Choice!, Please Choose Valid Choice:";
		   throw new InvalidChoiceException(msg);
	   }
      catch(Exception e) {
    	  System.out.println(e.getMessage());
      }
	}
}
}
}
