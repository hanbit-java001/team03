package com.hanbit.team03.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.service.ReserveMovieService;
import com.hanbit.team03.core.vo.ReserveMovieVO;
import com.hanbit.team03.core.vo.SelectCountReservedSeatVO;

@Controller
public class ReserveMovieController {

	@Autowired
	ReserveMovieService reserveMovieService;

	@RequestMapping("/reservation")
	public String goToPage(Model model) {
		return "reservation/reservation";
	}

	//이거 미완성인거같은데
	@RequestMapping("/api/reservation/reservation")
	@ResponseBody
	public ReserveMovieVO reservation(@RequestParam("movieId") int movieId,
							  @RequestParam("cinemaId") int cinemaId,
							  @RequestParam("theaterId") int theaterId,
							  @RequestParam("seatId") int seatId,
							  @RequestParam("timeId") String timeId){


		ReserveMovieVO reserveMovieVO = new ReserveMovieVO();
		reserveMovieVO.setTheaterId(theaterId);
		reserveMovieVO.setSeatId(seatId);
		reserveMovieVO.setTimeId(timeId);

		return reserveMovieVO;
	}

	@RequestMapping("/api/reservation/getMovieSchedule")
	@ResponseBody
	public List<SelectCountReservedSeatVO> getMovieSchedule(@RequestParam("movieId") int movieId, @RequestParam("cinemaId") int cinemaId){
		List<SelectCountReservedSeatVO> result = reserveMovieService.selectCountReservedSeat(movieId, cinemaId);
		return result;
	}
}
