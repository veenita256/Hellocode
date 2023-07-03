package com;

public interface EmployeeManagementSystem {

	void addEmployee();
	void displayEmployee();
	void displayAllEmployee();
	void removeEmployee();
	void removeAllEmployee();
	void updateEmployee();
	void countEmployee();
	void sortEmployee();
	void getEmployeeWithMiniSalary();
	void getEmployeeWithMaxSalary();
	
	//Automatically  all methods in interface are abstract and public
	//and variables are public,static,final
}
