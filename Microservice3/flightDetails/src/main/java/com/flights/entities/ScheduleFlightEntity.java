package com.flights.entities;

public class ScheduleFlightEntity {
	// Data members of ScheduleFlight class
	private int availableSeat;
	private String timing;
	// data member of FlightEntity class
	private Long flightNumber;

	//Dafault Constructor
	public ScheduleFlightEntity() {
		super();

	}

	public ScheduleFlightEntity(int availableSeat, String timing, Long flightNumber) {
		super();
		this.availableSeat = availableSeat;
		this.timing = timing;
		this.flightNumber = flightNumber;
	}

	public int getAvailableSeat() {
		return availableSeat;
	}

	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public Long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Long flightNumber) {
		this.flightNumber = flightNumber;
	}

}
