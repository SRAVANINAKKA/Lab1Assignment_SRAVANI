package com.cg.healthAssist.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;

import com.cg.healthAssist.dao.AmbulanceDao;
import com.cg.healthAssist.model.Ambulance;
import com.cg.healthAssist.model.Booking;
import com.cg.healthAssist.util.JPAUtil;

public class AmbulanceDaoImpl extends JPAUtil implements AmbulanceDao {
	private EntityManager entityManager;
	public AmbulanceDaoImpl() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public List<Booking> viewBooking(Booking booking) {
		// TODO Auto-generated method stub
		List<Booking> bookingList=entityManager.createQuery("",Booking.class).getResultList();
		return bookingList;
	}

	@Override
	public List<Ambulance> viewBookingHistory(Booking bookinghistory) {
		// TODO Auto-generated method stub
		List<Ambulance> ambulanceList=entityManager.createQuery("",Ambulance.class).getResultList();
		return ambulanceList ;
	}

	@Override
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		List<Booking> bookingList=entityManager.createQuery("",Booking.class).getResultList();
		return bookingList;
	}


	
	
	@Override
	public void commitTramsaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

//	public static void persist(Ambulance ambulance) {
//		// TODO Auto-generated method stub
//		EntityManager em = getEntityManager();
//		beginTransaction();
//		em.persist(ambulance);
//		commitTransaction(em);
//		closeEntityManager(em);
//	}
//
	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

	
	
	
}
