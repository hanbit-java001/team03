package com.hanbit.team03.core.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.ReserveDataListVO;
import com.hanbit.team03.core.vo.ReserveDetailDataVO;
import com.hanbit.team03.core.vo.ReserveMovieVO;

@Repository
public class ReserveMovieDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReserveMovieDAO.class);

	@Autowired
	private SqlSession sqlSession;

	public int insertReservation(List<ReserveMovieVO> list){
		LOGGER.debug("인서트 예매");
		int result = sqlSession.insert("reserveMovie.insertReservation", list);
		return result;
	}

	public int deleteReservation(int reserveId){
		LOGGER.debug("딜리트 예매");
		return sqlSession.delete("reserveMovie.deleteReservation", reserveId);
	}

	public ReserveDetailDataVO selectReservation(int reserveId){
		return sqlSession.selectOne("reserveMovie.selectReservation", reserveId);
	}

	public List<ReserveDataListVO> selectReservations(int userId){
		LOGGER.debug("셀렉트 예매들");
		List<ReserveDataListVO> result = sqlSession.selectList("reserveMovie.selectReservations", userId);
		return result;
	}

//	public ReserveMovieVO selectReserveProperties(String movieName, String cinemaName, String theater, String seatNumber){
//		Map params = new HashMap();
//		params.put("movieName", movieName);
//		params.put("cinemaName", cinemaName);
//		params.put("theater", theater);
//		params.put("seatNumber", seatNumber);
//
//		ReserveMovieVO result = sqlSession.selectOne("selectReserveProperties", params);
//		return result;
//	}



}
