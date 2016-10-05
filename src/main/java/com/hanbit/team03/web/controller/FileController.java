package com.hanbit.team03.web.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.vo.FileVO;
import com.hanbit.team03.core.service.FileService;

@Controller
public class FileController {

	@Autowired
	private FileService fileService;

	@RequestMapping("/file/{fileId}")
	@ResponseBody
	public void getFile(@PathVariable("fileId") String fileId, HttpServletResponse response) throws Exception{
		FileVO fileVO = fileService.getFile(fileId);

		response.setContentType(fileVO.getContentType());
		response.setContentLengthLong(fileVO.getFileSize());

		OutputStream outputStream = response.getOutputStream();
		outputStream.write(fileVO.getFileData());
		outputStream.close();
	}
}
