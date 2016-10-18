//package com.hanbit.team03.web.controller;
//
//import java.io.OutputStream;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.hanbit.team03.core.vo.CinemaFileVO;
//import com.hanbit.team03.core.service.CinemaFileService;
//
//@Controller
//public class CinemaFileController {
//
//	@Autowired
//	private CinemaFileService fileService;
//
//	@RequestMapping("/cinema/{fileId}")
//	@ResponseBody
//	public void getFile(@PathVariable("fileId") String fileId, HttpServletResponse response) throws Exception{
//		CinemaFileVO fileVO = fileService.getFile(fileId);
//
//		response.setContentType(fileVO.getCinemaContentType());
////		response.setContentLengthLong(fileVO.getMovieFileSize());
//
//
//		OutputStream outputStream = response.getOutputStream();
////		outputStream.write(fileVO.getFileData());
//		outputStream.close();
//	}
//}
