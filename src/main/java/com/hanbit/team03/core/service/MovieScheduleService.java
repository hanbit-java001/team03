package com.hanbit.team03.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanbit.team03.core.dao.MovieScheduleDAO;
import com.hanbit.team03.core.vo.TimeTableVO;


@Service
public class MovieScheduleService {

	@Autowired
	private MovieScheduleDAO movieScheduleDAO;

	public List<TimeTableVO> getTimeTable(int movieId, int cinemaId){
		movieScheduleDAO.selectCountReserveSeat(movieId, cinemaId);

		return movieScheduleDAO.selectMovieSchedule(movieId, cinemaId);
	}

}
