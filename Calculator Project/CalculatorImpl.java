package com;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int x,int y) {
		int sum=x+y;
		return sum;
	}
	
	@Override
	public int sub(int x,int y) {
		int diff=x-y;
		return diff;
	}
	
	@Override
	public int mul(int x,int y) {
		int product=x*y;   //or return x*y;
		return product;
	}
	
	@Override
	public int div(int x,int y) {
		if(y != 0) {  // To Avoid Arithmetic Exception
		return x/y;
		}
		else {
			return -1;
		}
	}
	
	@Override
	public String dispErrorMessage() {
		return "Invalid Choice/Number!!";
		
	}
}
