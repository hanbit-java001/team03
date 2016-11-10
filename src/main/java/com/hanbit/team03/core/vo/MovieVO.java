package com.hanbit.team03.core.vo;

public class MovieVO {

	private int movieId;
	private String movieName;
	private String movieDirector;
	private String movieGenre;

	private String MovieFilePath;
	private String MovieFileSize;

	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieFilePath() {
		return MovieFilePath;
	}
	public void setMovieFilePath(String movieFilePath) {
		MovieFilePath = movieFilePath;
	}
	public String getMovieFileSize() {
		return MovieFileSize;
	}
	public void setMovieFileSize(String movieFileSize) {
		MovieFileSize = movieFileSize;
	}





}
