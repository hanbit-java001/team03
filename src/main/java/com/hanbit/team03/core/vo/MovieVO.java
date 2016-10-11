package com.hanbit.team03.core.vo;

public class MovieVO {
	private int movieId;
	private String movieName;
	private String director;
	private String genre;

	private String MovieFileid;
	private String MovieFilePath;



	public String getMovieFileid() {
		return MovieFileid;
	}
	public void setMovieFileid(String movieFileid) {
		MovieFileid = movieFileid;
	}
	public String getMovieFilePath() {
		return MovieFilePath;
	}
	public void setMovieFilePath(String movieFilePath) {
		MovieFilePath = movieFilePath;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
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


}
