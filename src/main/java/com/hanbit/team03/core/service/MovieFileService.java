package com.hanbit.team03.core.service;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hanbit.team03.core.dao.MovieFileDAO;
import com.hanbit.team03.core.vo.MovieFileVO;

@Service
public class MovieFileService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieFileService.class);

	@Autowired
	private MovieFileDAO MovieFileDAO;

	public MovieFileVO getFile(String fileId) throws Exception{
		MovieFileVO MovieFileVO = MovieFileDAO.selectFile(fileId);
		String filePath = MovieFileVO.getMovieFilePath();

		byte[] fileData = FileUtils.readFileToByteArray(new File(filePath));


		return MovieFileVO;
	}




}
