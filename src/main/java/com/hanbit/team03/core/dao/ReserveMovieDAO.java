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
		ReserveDetailDataVO result = sqlSession.selectOne("reserveMovie.selectReservation", reserveId);
		System.out.println("DAO반환값"+result);
		return result;
	}

	public List<ReserveDataListVO> selectReservations(String userId){
		LOGGER.debug("셀렉트 예매들");
		List<ReserveDataListVO> result = sqlSession.selectList("reserveMovie.selectReservations", userId);
		return result;
	}



}
