package com.cg.healthAssist.util;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.healthAssist.exception.BookingIDException;
import com.cg.healthAssist.exception.BookingNotFoundException;
import com.cg.healthAssist.model.Booking;
import com.cg.healthAssist.service.AmbulanceService;
import com.cg.healthAssist.serviceimpl.AmbulanceServiceImpl;



public class MenuUtil {

	public void StartApp() { 
		// TODO Auto-generated method stub
	}
		private static AmbulanceService ambulanceService;
		static Scanner sc = new Scanner(System.in);
		/**
		 * Initializing the objects for service layer
		 */
		static {
			ambulanceService = new AmbulanceServiceImpl();
		} 
		@SuppressWarnings("resource")
		public static void main(String[] args) throws BookingNotFoundException {
			int choice = 0;
			do {
		System.out.println("1.view Booking List");
		System.out.println("2.Accept Booking ");
		System.out.println("3.Reject Booking ");
		System.out.println("4.view Booking History");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int ch=0;
		try {
			ch = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid option,please choose a valid option");
		}
		sc.nextLine();
		switch (ch) {
		case 1:
			viewBookingList();
			break;
		case 2:
			AcceptBooking();
			break;
		case 3:
			RejectBooking();
			break;
		case 4:
			
			try {
				viewBookingHistory();
			} catch (BookingIDException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		default:
			System.out.println("please select valid option");
			break;
		}
	} while (choice != 4);
}	
	
private static void viewBookingList() throws BookingNotFoundException{
			// TODO Auto-generated method stub
	int bid = 0;
	System.out.println("enter BookingId to find Booking Details");
	do {
		try {
			bid = sc.nextInt();
		} catch (InputMismatchException e) {
			e.getMessage();
			
		}
		sc.nextLine();
	} while (bid <= 0);
	System.out.println("No bookings Available");
}
		

private static void viewBookingHistory()throws BookingIDException {
			// TODO Auto-generated method stub
	int bid = 0;
	System.out.println("enter BookingId to find entire Booking Details");
	do {
		try {
			bid = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input, please enter a number for Id");
		}
		sc.nextLine();
	} while (bid <= 0);
		}

private static void RejectBooking() {
			// TODO Auto-generated method stub
			
		}

private static void AcceptBooking() {
			// TODO Auto-generated method stub
			
		}



private static void viewBooking() throws BookingNotFoundException {
	
	int bid = 0;
	System.out.println("enter patient details to be added");
	do {
		try {
			 
			bid = sc.nextInt();			
		} catch (InputMismatchException e) {
			System.out.println("Invalid input, please enter a valid input");
		}
		sc.nextLine();
	} while (bid <= 0);
	String bookingid = sc.next();
	String Patientname = sc.next();
	String Destname = sc.next();
	double contactno =sc.nextInt();
	String bookingdate = sc.next();
	Booking  booking = new Booking(bid, Patientname, contactno, Destname, bookingdate, false);
	//AmbulanceService.List<Booking>.viewBooking();
}

	}	


