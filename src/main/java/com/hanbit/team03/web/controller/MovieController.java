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


	@RequestMapping(value="/api/movie/list", method=RequestMethod.GET)
	@ResponseBody
	public List<MovieVO> getMovies() {

		return movieService.getMovies();
	}


	@RequestMapping(value="/api/movie/list2", method=RequestMethod.GET)
	@ResponseBody
	public List<MovieVO> getMovieNameId() {
		return movieService.getMovieNameId();
	}


	@RequestMapping(value="/api/movie/detail", method=RequestMethod.GET)
	@ResponseBody
	public MovieVO getMovieDetails(@RequestParam("movieId") int movieId){
		MovieVO result = movieService.getMovieDetails(movieId);

		return result;
	}

}

