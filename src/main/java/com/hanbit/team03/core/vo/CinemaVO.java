package com.hanbit.team03.core.vo;

public class CinemaVO {
	private int cinemaId;
	private String cinemaName;
	private String cinemaAddress;

	private String CinemaFileid;
	private String CinemaFilePath;



	public String getCinemaAddress() {
		return cinemaAddress;
	}
	public void setCinemaAddress(String cinemaAddress) {
		this.cinemaAddress = cinemaAddress;
	}
	public int getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getCinemaFileid() {
		return CinemaFileid;
	}
	public void setCinemaFileid(String cinemaFileid) {
		CinemaFileid = cinemaFileid;
	}
	public String getCinemaFilePath() {
		return CinemaFilePath;
	}
	public void setCinemaFilePath(String cinemaFilePath) {
		CinemaFilePath = cinemaFilePath;
	}



}
