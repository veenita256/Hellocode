package com.icici;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Wel Come To ICICI Bank");
		System.out.println("<......................>");
		Scanner ip=new Scanner(System.in);


		Bank b=new BankImpl(5000);    //Abstraction ->Upcasting

		while(true) {
			System.out.println("1.Deposite\n2.Withdraw\n3.Check Balance\n4.Exit");
			System.out.println("Enter UR CHOICE");
			System.out.println("..................");
			int choice=ip.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter Amount To Be Deposite Rs.");
				int amountToDeposite=ip.nextInt();
				b.deposite(amountToDeposite);
				//b.deposite(ip.nextInt(););
				break;

			case 2:
				System.out.println("Enter Amount To Be Withdraw Rs.");
				int amountToWithdraw=ip.nextInt();
				b.withdraw(amountToWithdraw);
				break;

			case 3:
				System.out.println("Bank Balance Rs."+b.getBalance());
				break;

			case 4:
				System.out.println("Thank You!!");
				System.exit(0);
				break;

			default: //Invalid Choice exception
				//or System.out.println("Invalid Choice");
				try {
					throw new InvalidChoiceException("Kindly Enter Rigth Choice");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				 
			}
			System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		}
	}
}
