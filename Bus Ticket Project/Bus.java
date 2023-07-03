package org;

public interface Bus {
 void ticketBooking(int tickets);
 void ticketCancel(int tickets);
 int getTickets();
 String displayErrorMessage();
 
}
