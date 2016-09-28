package com.hanbit.team03.core.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.ReserveMovieVO;
import com.hanbit.team03.core.vo.SelectDataVO;

@Repository
public class ReserveMovieDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReserveMovieDAO.class);

	@Autowired
	private SqlSession sqlSession;

	public int insertReservation(ReserveMovieVO reserveMovieVO){
		return 0;
	}

	public int deleteReservation(int reserveId){
		return 0;
	}

	public SelectDataVO selectReservation(int reserveId){
		
		
		
		return null;
	}

	public List<ReserveMovieVO> selectReservations(String userId){
		return null;
	}



}
