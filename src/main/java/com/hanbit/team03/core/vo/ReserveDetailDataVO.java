package com.hanbit.team03.core.vo;

public class ReserveDetailDataVO {
	private int reserveId;
	private String cinemaName;
	private String theaterName;
	private String movieName;
	private String startTime;
	private String seatNumber;
	//private String endTime;


	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
//	public String getEndTime() {
//		return endTime;
//	}
//	public void setEndTime(String endTime) {
//		this.endTime = endTime;
//	}
	public int getReserveId() {
		return reserveId;
	}
	public void setReserveId(int reserveId) {
		this.reserveId = reserveId;
	}




}
