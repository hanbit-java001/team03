package com.hanbit.team03.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.service.ReserveMovieService;
import com.hanbit.team03.core.vo.ReserveMovieVO;

@Controller
public class ReserveMovieController {

	@Autowired
	ReserveMovieService reserveMovieService;

	@RequestMapping("/reservation")
	public String goToPage(Model model) {
		return "reservation/reservation";
	}

	@RequestMapping("/api/reservation/reservation")
	@ResponseBody
	public String reservation(@RequestParam("movieId") int movieId,
							  @RequestParam("cinemaId") int cinemaId,
							  @RequestParam("theaterId") int theaterId,
							  @RequestParam("seatId") int seatId,
							  @RequestParam("timeId") String timeId){


		ReserveMovieVO reserveMovieVO = new ReserveMovieVO();
		reserveMovieVO.setTheaterId(theaterId);
		reserveMovieVO.setSeatId(seatId);
		reserveMovieVO.setTimeId(timeId);

		return "/api/reservation/reservation";
	}
}
