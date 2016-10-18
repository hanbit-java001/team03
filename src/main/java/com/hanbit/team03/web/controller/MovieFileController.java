package com.hanbit.team03.web.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.vo.MovieFileVO;
import com.hanbit.team03.core.service.MovieFileService;
//
@Controller
public class MovieFileController {

	@Autowired
	private MovieFileService fileService;

	@RequestMapping("/movie/{fileId}")
	@ResponseBody
	public void getFile(@PathVariable("fileId") String fileId, HttpServletResponse response) throws Exception{
		MovieFileVO fileVO = fileService.getFile(fileId);

		response.setContentType(fileVO.getMovieContentType());
//		response.setContentLengthLong(fileVO.getMovieFileSize());


		OutputStream outputStream = response.getOutputStream();
//		outputStream.write(fileVO.getFileData());
		outputStream.close();
	}
////
////	@Autowired
////	private MovieFileService fileService;
////
////	@RequestMapping("/file/{fileId}")
////	@ResponseBody
////	public void getFile(@PathVariable("fileId") String fileId, HttpServletResponse response) throws Exception{
////		MovieFileVO fileVO = fileService.getFile(fileId);
////
////		response.setContentType(fileVO.getMovieContentType());
//////		response.setContentLengthLong(fileVO.getMovieFileSize());
////
////
//////		OutputStream outputStream = response.getOutputStream();
////////		outputStream.write(fileVO.getFileData());
//////		outputStream.close();
//	}
////
////	@Autowired
////	private MovieFileService fileService;
////
////	@RequestMapping("/file/{fileId}")
////	@ResponseBody
////	public void getFile(@PathVariable("fileId") String fileId, HttpServletResponse response) throws Exception{
////		MovieFileVO fileVO = fileService.getFile(fileId);
////
////		response.setContentType(fileVO.getMovieContentType());
//////		response.setContentLengthLong(fileVO.getMovieFileSize());
////
////
//////		OutputStream outputStream = response.getOutputStream();
////////		outputStream.write(fileVO.getFileData());
//////		outputStream.close();
//	}
}
