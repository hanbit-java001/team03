package com.hanbit.team03.core.vo;

public class FileVO {

	private String Fileid;
	private String FileSize;
	private String FilePath;
	private String ContentType;
	private String FileName;
	private byte[] FileData;
	public String getFileid() {
		return Fileid;
	}
	public void setFileid(String fileid) {
		Fileid = fileid;
	}
	public String getFileSize() {
		return FileSize;
	}
	public void setFileSize(String fileSize) {
		FileSize = fileSize;
	}
	public String getFilePath() {
		return FilePath;
	}
	public void setFilePath(String filePath) {
		FilePath = filePath;
	}
	public String getContentType() {
		return ContentType;
	}
	public void setContentType(String contentType) {
		ContentType = contentType;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public byte[] getFileData() {
		return FileData;
	}
	public void setFileData(byte[] fileData) {
		FileData = fileData;
	}



}
