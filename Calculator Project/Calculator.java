package com;

public interface Calculator {

	int add(int x,int y); 
	int sub(int x,int y);
    int mul(int x,int y);
	int div(int x,int y);
	String dispErrorMessage();

	// all the methods are automatically public and static
}