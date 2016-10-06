package com.hanbit.team03.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.service.MovieService;
import com.hanbit.team03.core.vo.MovieVO;

@Controller
public class MovieController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private MovieService movieService;

	@RequestMapping("/movie/now")
	public String list() {

		return "movie/movieList";
	}

	@RequestMapping(value="/api/movie/{movieId}", method=RequestMethod.GET)
	@ResponseBody
	public MovieVO getSchedule(@PathVariable("movieId") String movieId) {

		return movieService.getMovie(movieId);
	}


}

