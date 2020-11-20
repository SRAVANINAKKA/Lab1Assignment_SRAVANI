package com.cg.healthAssist.model;

import javax.persistence.Id;

public class Booking {
	
		@Id
		
		private long bid;
		private String PatientName;
	    private double contactno;
		private String Address;
		private String bookingdate;
		private boolean BookingResult;
		public Booking(long bid, String patientName, double contactno, String address, String bookingdate,
				boolean bookingResult) {
			super();
			this.bid = bid;
			this.PatientName = patientName;
			this.contactno = contactno;
			this.Address = address;
			this.bookingdate = bookingdate;
			this.BookingResult = bookingResult;
		}
		public long getBid() {
			return bid;
		}
		public void setBid(long bid) {
			this.bid = bid;
		}
		public String getPatientName() {
			return PatientName;
		}
		public void setPatientName(String patientName) {
			PatientName = patientName;
		}
		public double getContactno() {
			return contactno;
		}
		public void setContactno(double contactno) {
			this.contactno = contactno;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getBookingdate() {
			return bookingdate;
		}
		public void setBookingdate(String bookingdate) {
			this.bookingdate = bookingdate;
		}
		public boolean isBookingResult() {
			return BookingResult;
		}
		public void setBookingResult(boolean bookingResult) {
			BookingResult = bookingResult;
		}
		@Override
		public String toString() {
			return "Booking [bid=" + bid + ", PatientName=" + PatientName + ", contactno=" + contactno + ", Address="
					+ Address + ", bookingdate=" + bookingdate + ", BookingResult=" + BookingResult + "]";
		}
		
				
}