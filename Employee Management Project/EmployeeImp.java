package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customsorting.SortEmployeeBySalary;
import customsorting.SortEmployeeByAge;
import customsorting.SortEmployeeById;
import customsorting.SortEmployeeByName;

import customexception.EmployeeNotFoundException;


public class EmployeeImp implements EmployeeManagementSystem{
	Scanner ip=new Scanner(System.in);
	Map<String,Employee> db=new LinkedHashMap<String,Employee>();

	@Override
	public void addEmployee() {
		System.out.println("Enter Emp Age:");
		int age=ip.nextInt();
		
		System.out.println("Enter Emp Name:");
		String name=ip.next();
		
		System.out.println("Enter Emp Salary:");
		double salary=ip.nextDouble();
		
		
		Employee emp=new Employee(age, name, salary);
		db.put(emp.getId(), emp);
		System.out.println("Employee Records inseted succsessfully");
		System.out.println("Employee id is:"+emp.getId());
	}
	
	@Override
	public void displayEmployee() {
		System.out.println("Enter Employee id:");
		String id=ip.next();
		id=id.toUpperCase();
		
		if(db.containsKey(id)) {
			Employee emp=db.get(id);
			System.out.println("Emp ID:"+emp.getId());
			System.out.println("Emp Age:"+emp.getAge());
			System.out.println("Emp Name:"+emp.getName());
			System.out.println("Emp Salary:"+emp.getSalary());
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee Not Found!!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	@Override
	public void displayAllEmployee() {
		if(db.size() !=0 ) {
			System.out.println("All Employee records displaying");
			Set<String> keys=db.keySet();
			for(String key: keys) {
				Employee e=db.get(key);
				System.out.println(e); //or System.out.println(db.get(key));
			}
			}
			else {
				
				try {
					String msg="Employee Database is Empty";
					throw new EmployeeNotFoundException(msg);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
	}
	
	
	@Override
	public void removeEmployee() {
		System.out.println("Enter Employee id:");
		String id=ip.next().toUpperCase();
		
		
		if(db.containsKey(id)) {
			System.out.println("Employee record successfully");
			System.out.println(db.get(id));
			db.remove(id);
			System.out.println("Employee record deleted successfully");
			
		}
		else {
			try {
				String msg="Employee with the "+id+" is not Found";
				throw new EmployeeNotFoundException(msg);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	@Override
	public void removeAllEmployee() {
		if(db.size() !=0 ) {
			System.out.println("Available Employee size:"+db.size());
			db.clear();
			System.out.println("Employee all records deleted");
		}
			else {
				try {
					String msg="Employee Database is Empty!! Nothing to delete";
					throw new EmployeeNotFoundException(msg);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
	}
	
	
	@Override
	public void updateEmployee() {
		System.out.println("Enter the Id:");
		String id=ip.next().toUpperCase();
		
		if(db.containsKey(id)) {
			Employee std=db.get(id);
			
			System.out.println("1.Update age\n2.Update name\n3.Update Salary");
			System.out.println("Enter the choice:");
			int choice=ip.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Age");
				int age=ip.nextInt();
				std.setAge(age);   //std.setAge(ip.nextInt());
				System.out.println("Age updated successfully");
				break;
				
			case 2:
				System.out.println("Enter Name");
				String name=ip.next();
				std.setName(name);     //std.setName(ip.next());
				System.out.println("Name updated successfully");
				break;
				
			case 3:
				System.out.println("Enter Salary");
				int salary=ip.nextInt();
				std.setSalary(salary);
				System.out.println("Salary updated successfully");
				break;
				
				default:
					System.out.println("Invalid choice");	
			}
		}
			else {
				try {
					String msg="Employee Database is Empty!! Nothing to Update";
					throw new EmployeeNotFoundException(msg);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
	}
	
	
	
	@Override
	public void countEmployee() {
		System.out.println("Available Emp Records:"+db.size());
	}
	
	
	
	@Override
	public void sortEmployee() {
		if(db.size()>=2) {
			Set<String > keys=db.keySet();
			List<Employee> al=new ArrayList<Employee>();
			for(String key: keys) {
				al.add(db.get(key)); //adding student object into List
			}
			
			System.out.println("1.EmpSortById\n2.EmpSortByAge\n3.EmpSortByName\n4.EmpSortBySalary");
			System.out.println("Enter choice:");
			int choice=ip.nextInt();
			
			switch(choice) {
			
			case 1:
				Collections.sort(al, new SortEmployeeById());
				for(Employee s: al) {
					System.out.println(s);
				}
				break;
				
			case 2:
				Collections.sort(al, new SortEmployeeByAge());
				for(Employee s: al) {
					System.out.println(s);
				}
				break;
				
			case 3:
				Collections.sort(al, new SortEmployeeByName());
				for(Employee s: al) {
					System.out.println(s);
				}
				break;
				
			case 4:
				Collections.sort(al, new SortEmployeeBySalary());
				for (Employee s: al) {
					System.out.println(s);
				}
				break;
				
				default:
					System.out.println("INvalid choice");
			}	
		}
		
		else {
			System.out.println("Insufficient Student Data");
			//or invoke exception
		}
	}
	
	
	
	@Override
	public void getEmployeeWithMiniSalary() {
		if(db.size()>=2) {
			Set<String > keys=db.keySet();
			List<Employee> al=new ArrayList<Employee>();
			for(String key: keys) {
				al.add(db.get(key));
		}
			
		Collections.sort(al, new SortEmployeeBySalary());
		System.out.println(al.get(0));
		}
		else {
			System.out.println("Insufficient Employee to Compare");
		}
	}
	
	@Override
	public void getEmployeeWithMaxSalary() {
		if(db.size()>=2) {
			Set<String > keys=db.keySet();
			List<Employee> al=new ArrayList<Employee>();
			for(String key: keys) {
				al.add(db.get(key));
		}
			
		Collections.sort(al, new SortEmployeeBySalary());
		System.out.println(al.get(db.size()-1));
		}
		else {
			System.out.println("Insufficient Employee to compare");
		}
	}
}
