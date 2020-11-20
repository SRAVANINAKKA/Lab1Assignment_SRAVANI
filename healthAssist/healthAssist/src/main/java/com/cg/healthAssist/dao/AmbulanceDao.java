package com.cg.healthAssist.dao;

import com.cg.healthAssist.model.Ambulance;
import com.cg.healthAssist.model.Booking;

import java.util.List;

public interface AmbulanceDao {
	public List<Booking> viewBooking(Booking booking);
	public List<Ambulance> viewBookingHistory(Booking bookinghistory);
	public List<Booking> getAllBookings();
   
	// TODO Auto-generated method stub
	
   void beginTransaction();
   void commitTramsaction();

}
