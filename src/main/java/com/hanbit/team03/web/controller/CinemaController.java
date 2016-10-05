package com.hanbit.team03.web.controller;

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
import com.hanbit.team03.core.vo.MovieVO;


@Controller
public class CinemaController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private CinemaService cinemaService;

	@RequestMapping("/cinema/theater")
	public String list() {

		return "cinema/theater";
	}

	@RequestMapping(value="/api/cinema/{cinemaId}", method=RequestMethod.GET)
	@ResponseBody
	public CinemaVO getCinema(@PathVariable("cinemaId") String cinemaId) {

		return cinemaService.getCinema(cinemaId);
	}

}
