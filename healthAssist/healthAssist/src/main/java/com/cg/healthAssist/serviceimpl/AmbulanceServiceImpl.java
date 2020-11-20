package com.cg.healthAssist.serviceimpl;

import com.cg.healthAssist.dao.AmbulanceDao;
import com.cg.healthAssist.daoimpl.AmbulanceDaoImpl;
import com.cg.healthAssist.exception.BookingIDException;
import com.cg.healthAssist.model.Ambulance;
import com.cg.healthAssist.model.Booking;
import com.cg.healthAssist.service.AmbulanceService;

import java.util.List;

public class AmbulanceServiceImpl implements AmbulanceService{
	private AmbulanceDao ambulanceDao;
	public AmbulanceServiceImpl() {
		
	 ambulanceDao = new AmbulanceDaoImpl();
	}
	public void addAmbulance(Ambulance ambulance) {
	

}
	public List<Ambulance> listAmbulance(){
   return null;		
	}
	public Ambulance findBookingeById(Long Id) throws BookingIDException{
		return null;
	}

	public boolean ApporveBooking() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	@Override
	public List<Booking> viewBooking() {
		// TODO Auto-generated method stub
		ambulanceDao.beginTransaction();
		List<Booking> bookList =  ambulanceDao.viewBooking(null); 
		return bookList;
		
	}
	@Override
	public List<Ambulance> viewBookingHistory() {
		// TODO Auto-generated method stub
		ambulanceDao.beginTransaction();
		List<Ambulance> ambulanceList =  ambulanceDao.viewBookingHistory(null); 
		return ambulanceList;
		
	}
	
	
	
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		ambulanceDao.beginTransaction();
		List<Booking> bookList =  ambulanceDao.getAllBookings(); 
		return bookList;
	}
}