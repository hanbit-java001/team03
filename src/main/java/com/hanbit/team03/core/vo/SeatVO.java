package com.hanbit.team03.core.vo;

public class SeatVO {
	private int seatId;
	private int theaterId;
	private String seatNumber;		//A11, K11, 이런식으로
	private int reserVation;

	public int getReserVation() {
		return reserVation;
	}
	public void setReserVation(int reserVation) {
		this.reserVation = reserVation;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}


}
