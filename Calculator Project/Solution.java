package com;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	Calculator c=new CalculatorImpl();
	
	 while(true)             {
System.out.println("Choose Your Choice :) ");		 
System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divission\n5.Exit");
     int choice=ip.nextInt();
     
     int x=0;
     int y=0;
     
     if(choice>=1 && choice<=4) {
    		System.out.println("Enter X value:");
    		x=ip.nextInt();
    		System.out.println("Enter y value:");
    		y=ip.nextInt();
    		}
     
     switch(choice) {
     case 1:
    	 System.out.println("Addition of "+x+" and "+y+" is->"+c.add(x, y));
    	 break;
    	 
     case 2:
    	 System.out.println("Subtrsction of "+x+" and "+y+" is->"+c.sub(x, y));
    	 break;
    	 
     case 3:
    	 System.out.println("Multiplication of "+x+" and "+y+" is->"+c.mul(x, y));
    	 break;
    	 
     case 4:
    	 int result=c.div(x, y);
    	 if(result != -1) {
    	 System.out.println("Divission of "+x+" and "+y+" is->"+result);
    	 }
    	 else {
    		 System.out.println("Not Possible to perform div operation beacuse denominator is 0");
    	 }
    	 break;
    	 
     case 5:
    	 System.out.println("Thank You!");
    	 System.exit(0);//used to terminate JVM(program)
    	 break;
    	 
     default:
    	 System.out.println(c.dispErrorMessage());
     }
     System.out.println("................................");
     
                                     }//while loop close here
}
}
