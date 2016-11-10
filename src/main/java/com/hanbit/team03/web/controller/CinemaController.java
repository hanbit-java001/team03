package com.hanbit.team03.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.service.CinemaService;
import com.hanbit.team03.core.vo.CinemaVO;


@Controller
public class CinemaController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private CinemaService cinemaService;

	@RequestMapping("/cinema/theater")
	public String list() {

		return "cinema/cinemaList";
	}

	@RequestMapping(value="/api/cinema/list", method=RequestMethod.GET)
	@ResponseBody
	public List<CinemaVO> getCinemas() {

		return cinemaService.getCinemas();
	}

	@RequestMapping("/api/cinema/list2")
	@ResponseBody
	public List<CinemaVO> getCinemaNameId() {
		return cinemaService.getCinemaNameId();
	}


	@RequestMapping(value="/api/cinema/detail", method=RequestMethod.GET)
	@ResponseBody
	public CinemaVO getCinema(int cinemaId) {
		CinemaVO result = cinemaService.getCinemaDetail(cinemaId);
		return result;
	}

}
