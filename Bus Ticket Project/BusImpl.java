package org;

public class BusImpl implements Bus {
private int totalTickets;

BusImpl(int totalTickets){
	this.totalTickets=totalTickets;
}

@Override
public void ticketBooking(int tickets) {
	if(tickets<=totalTickets) {
	System.out.println("Booking Tickets:"+tickets);
	totalTickets=totalTickets-tickets;
	System.out.println("Tickets Booked Successfully");
	}
	else {
		try {
			throw new Exception("Tickets Not Available! Sorry!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

@Override
public void ticketCancel(int tickets) {
	System.out.println("Tickets canceled:"+tickets);
	totalTickets=totalTickets+tickets;
	System.out.println("Tickets are canceled!!!");
}

@Override
public int getTickets() {
	return totalTickets;
}

@Override
public String displayErrorMessage() {
	return "Invalid Choice!!! Choose Correct Choice:)";
}
}
