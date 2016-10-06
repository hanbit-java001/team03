package com.hanbit.team03.core.vo;

public class SelectCountReservedSeatVO {
	//THEATER_ID, THEATER_NAME, START_TIME, TOTAL_SEAT, TIME_ID, RESERVED_SEAT 반환

	private int theaterId;
	private String theaterName;
	private String startTime;
	private int totalSeat;
	private String timeId;
	private int reservedSeat;

	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public String getTimeId() {
		return timeId;
	}
	public void setTimeId(String timeId) {
		this.timeId = timeId;
	}
	public int getReservedSeat() {
		return reservedSeat;
	}
	public void setReservedSeat(int reservedSeat) {
		this.reservedSeat = reservedSeat;
	}






}
