package com.hanbit.team03.core.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.ReserveMovieVO;
import com.hanbit.team03.core.vo.ReserveDetailDataVO;

@Repository
public class ReserveMovieDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReserveMovieDAO.class);

	@Autowired
	private SqlSession sqlSession;

	public int insertReservation(ReserveMovieVO reserveMovie){
		LOGGER.debug("인서트 예매");
		int result = sqlSession.insert("reserveMovie.insertReservation", reserveMovie);
		return result;
	}

	public int deleteReservation(int reserveId){
		LOGGER.debug("딜리트 예매");
		int result = sqlSession.delete("reserveMovie.deleteReservation", reserveId);
		return result;
	}

	public ReserveDetailDataVO selectReservation(int reserveId){
		ReserveDetailDataVO result = (ReserveDetailDataVO) sqlSession.selectList("reserveMovie.selectReservation", reserveId);
		return null;
	}

	public List<ReserveMovieVO> selectReservations(String userId){
		LOGGER.debug("셀렉트 예매들");
		List<ReserveMovieVO> result = sqlSession.selectList("reserveMovie.selectReservations", userId);
		return result;
	}



}
