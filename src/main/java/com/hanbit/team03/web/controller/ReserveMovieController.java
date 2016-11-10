package com.hanbit.team03.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.hanbit.team03.core.service.ReserveMovieService;
import com.hanbit.team03.core.session.Session;
import com.hanbit.team03.core.session.SessionHelper;
import com.hanbit.team03.core.vo.ReserveDataListVO;
import com.hanbit.team03.core.vo.ReserveDetailDataVO;
import com.hanbit.team03.core.vo.ReserveMovieVO;
import com.hanbit.team03.core.vo.SeatVO;
import com.hanbit.team03.core.vo.SelectCountReservedSeatVO;

@Controller
public class ReserveMovieController {

	@Autowired
	ReserveMovieService reserveMovieService;

	@RequestMapping("/reservation")
	public String goToReservationPage(Model model) {
		Session session = SessionHelper.getSession();
		if(session.isLoggedIn()){
			return "reservation/reservation";
		}else return "member/login";
	}

	@RequestMapping("reservation/seatReservation")
	public String goToSeatReservationPage(Model model) {
		return "reservation/seatReservation";
	}


	//이거 미완성인거같은데
	@RequestMapping("/api/reservation/reservation")
	@ResponseBody
	public  int reservation(@RequestBody List<Map<String, Object>> getList){
		Session session = SessionHelper.getSession();
		List<ReserveMovieVO> list = new ArrayList<ReserveMovieVO>();
		for(Map<String, Object> m : getList){
			ReserveMovieVO reserveMovieVO = new ReserveMovieVO();
			reserveMovieVO.setTheaterId((Integer.parseInt(m.get("theaterId").toString())));
			reserveMovieVO.setTimeId(m.get("timdId").toString());
			reserveMovieVO.setSeatId((Integer.parseInt(m.get("seatId").toString())));
			reserveMovieVO.setCinemaId((Integer.parseInt(m.get("cinemaId").toString())));
			reserveMovieVO.setUserId(session.getMemberId());
			list.add(reserveMovieVO);
		}
		return reserveMovieService.reserveMovie(list);
	}

	@RequestMapping("/api/reservation/reservationList")
	@ResponseBody
	public  List<ReserveDataListVO> reservationList(){
		Session session = SessionHelper.getSession();
		List<ReserveDetailDataVO> list = new ArrayList<ReserveDetailDataVO>();
		return reserveMovieService.getReservations(session.getMemberId());
	}

	@RequestMapping("/api/reservation/reservationDetail")
	@ResponseBody
	public  ReserveDetailDataVO reservationDetail(@RequestParam("reserveId") int reserveId){
		return reserveMovieService.getDetailReservation(reserveId);
	}


	@RequestMapping("/api/reservation/getMovieSchedule")
	@ResponseBody
	public List<SelectCountReservedSeatVO> getMovieSchedule(@RequestParam("movieId") String clickedMovieId, @RequestParam("cinemaId") String clickedCinemaId){
		int movieId = Integer.parseInt(clickedMovieId);
		int cinemaId = Integer.parseInt(clickedCinemaId);
		List<SelectCountReservedSeatVO> result = reserveMovieService.selectCountReservedSeat(movieId, cinemaId);
		return result;
	}

	@RequestMapping("/api/reservation/getSeat")
	@ResponseBody
	public List<SeatVO> getSeat(@RequestParam("timeId") String paramTimeId, @RequestParam("theaterId") String paramTheaterId){

		String timeId = paramTimeId;
		int theaterId = Integer.parseInt(paramTheaterId);

		List<SeatVO> total = reserveMovieService.selectTotalSeat(timeId, theaterId);
		List<SeatVO> reserved = reserveMovieService.selectReservedSeat(timeId, theaterId);

		int index = 0;

		for(int i=0;i<total.size();i++){
			if ( index < reserved.size() && total.get(i).getSeatId() == (reserved.get(index).getSeatId()) )
			{
				total.get(i).setReserVation(1);
				index++;
			}
			else
			{
				total.get(i).setReserVation(0);
			}
		}
		return total;
	}
}
