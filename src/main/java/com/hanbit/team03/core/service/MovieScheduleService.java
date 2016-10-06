package com.hanbit.team03.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanbit.team03.core.dao.MovieScheduleDAO;
import com.hanbit.team03.core.vo.SelectCountReservedSeatVO;
import com.hanbit.team03.core.vo.TimeTableVO;


@Service
public class MovieScheduleService {

	@Autowired
	private MovieScheduleDAO movieScheduleDAO;

	//selectCountReservedSeat가 사실상 타임테이블 이므로 필요없어보여서 지울라다가 혹시모르니 주석처리함
//	public List<TimeTableVO> getTimeTable(int movieId, int cinemaId){
//		return movieScheduleDAO.selectMovieSchedule(movieId, cinemaId);
//	}

	//THEATER_ID, THEATER_NAME, START_TIME, TOTAL_SEAT, TIME_ID, RESERVED_SEAT 반환
	public List<SelectCountReservedSeatVO> selectCountReservedSeat(int movieId, int cinemaId){
		return movieScheduleDAO.selectCountReservedSeat(movieId, cinemaId);
	}

}
