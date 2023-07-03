package org;

import java.util.Scanner;

public class BusSolution {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	Bus b=new BusImpl(200);
	
	System.out.println("1.Tickets Booking\n2.Tickets Cancel\n3.Tickets Available\n4.Exit");
	
	while(true) {
	System.out.println("Enter Your Choice:");
	int choice=ip.nextInt();
	
	switch(choice){
	case 1:
		System.out.println("Tickets are Available for Booking");
		int ticketsToBooking=ip.nextInt();
		b.ticketBooking(ticketsToBooking);
		//System.out.println("");
		break;
		
	case 2:
		System.out.println("Tickets Canceling");
		int ticketsToCancel=ip.nextInt();
		b.ticketCancel(ticketsToCancel);
		//System.out.println("");
		break;
		
	case 3: 
		System.out.println("Total Available Tickets are:");
		System.out.println(b.getTickets());
		break;
		
	case 4:
		System.out.println("Thank You For Visiting Us:)");
		System.exit(0);
		
		default:
			System.out.println(b.displayErrorMessage());
	}
	System.out.println("=======");
	}	
}
}
