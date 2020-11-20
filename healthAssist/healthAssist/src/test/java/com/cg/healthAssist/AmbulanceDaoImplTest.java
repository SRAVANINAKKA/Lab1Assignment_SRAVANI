package com.cg.healthAssist;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.healthAssist.daoimpl.AmbulanceDaoImpl;
import com.cg.healthAssist.model.Ambulance;
import com.cg.healthAssist.model.Booking;

public class AmbulanceDaoImplTest {
private static AmbulanceDaoImpl ambulanceDao;
	
	
	/**
	 * Run once before running any test cases and create a new instance of ambulance dao.
	 */
	@BeforeClass
	public static void runOnce() {
		ambulanceDao = new AmbulanceDaoImpl();
	}
	
	/**
	 * Test the persist functionality whether it saving the booking  inside the database or not.
	 */
	@Test
	public void test_Persist_GivenBooking() {
		Booking B1= new Booking(1,"Mankind",876543297,"hyd","12/12/2020", false);
		Booking B2 = new Booking(2,"Dispirin",80490858,"nuz","01/01/2022", false);
		
		List<Booking> bookingList = new ArrayList<>();
		bookingList.add(B1);
		bookingList.add(B2);
		
		Ambulance ambulance = new Ambulance((long) 1,"345","Shubham");
	     //AmbulanceDaoImpl.viewBookingHistory();
		
}
}
