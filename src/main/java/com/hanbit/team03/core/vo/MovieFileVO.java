package com.hanbit.team03.core.vo;

public class MovieFileVO {

	private String MovieFileid;
	private String MovieFileSize;
	private String MovieFilePath;
	private String MovieContentType;
	private String MovieFileName;
	private byte[] MovieFileData;

	public String getMovieFileid() {
		return MovieFileid;
	}
	public void setMovieFileid(String movieFileid) {
		MovieFileid = movieFileid;
	}
	public String getMovieFileSize() {
		return MovieFileSize;
	}
	public void setMovieFileSize(String movieFileSize) {
		MovieFileSize = movieFileSize;
	}
	public String getMovieFilePath() {
		return MovieFilePath;
	}
	public void setMovieFilePath(String movieFilePath) {
		MovieFilePath = movieFilePath;
	}
	public String getMovieContentType() {
		return MovieContentType;
	}
	public void setMovieContentType(String movieContentType) {
		MovieContentType = movieContentType;
	}
	public String getMovieFileName() {
		return MovieFileName;
	}
	public void setMovieFileName(String movieFileName) {
		MovieFileName = movieFileName;
	}
	public byte[] getMovieFileData() {
		return MovieFileData;
	}
	public void setMovieFileData(byte[] movieFileData) {
		MovieFileData = movieFileData;
	}


}
