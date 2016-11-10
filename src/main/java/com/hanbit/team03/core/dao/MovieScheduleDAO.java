package com.hanbit.team03.core.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.SelectCountReservedSeatVO;
import com.hanbit.team03.core.vo.TimeTableVO;


@Repository
public class MovieScheduleDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReserveMovieDAO.class);

	@Autowired
	private SqlSession sqlSession;

//	public List<TimeTableVO> selectMovieSchedule(int movieId, int cinemaId){
//		Map params = new HashMap();
//		params.put("movieId", movieId);
//		params.put("cinemaId", cinemaId);
//		List<TimeTableVO> result = sqlSession.selectList("selectMovieSchedule", params);
//		return result;
//	}

	public List<SelectCountReservedSeatVO> selectCountReservedSeat(int movieId, int cinemaId){
		Map params = new HashMap();
		params.put("movieId", movieId);
		params.put("cinemaId", cinemaId);
		List<SelectCountReservedSeatVO> result = sqlSession.selectList("selectCountReservedSeat", params);
		return result;

	}

}
