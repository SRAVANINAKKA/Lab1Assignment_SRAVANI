package com.cg.healthAssist.service;

import java.util.List;

import com.cg.healthAssist.model.Ambulance;
import com.cg.healthAssist.model.Booking;

public interface AmbulanceService {
	
	

	
	
    public boolean ApporveBooking();
    
    public List<Ambulance> viewBookingHistory();
    public List<Booking> getAllBookings();

	//public void viewBooking(Booking booking);

	public List<Booking> viewBooking();

	
 

}
