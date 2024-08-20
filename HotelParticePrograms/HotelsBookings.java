package com.jsp.hibernate.HotelParticePrograms;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HotelsBookings {
	@Id
	private int hotelId;
	private String hotelName;
	private String location;
	private int bookingCost;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getBookingCost() {
		return bookingCost;
	}
	public void setBookingCost(int bookingCost) {
		this.bookingCost = bookingCost;
	}
	@Override
	public String toString() {
		return "HotelsBookings [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location
				+ ", bookingCost=" + bookingCost + "]";
	}
	
	

}
