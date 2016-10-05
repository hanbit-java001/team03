package com.hanbit.team03.core.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.CinemaVO;
import com.hanbit.team03.core.vo.MovieVO;

@Repository
public class CinemaDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReserveMovieDAO.class);

	@Autowired
	private SqlSession sqlSession;


	public List<CinemaVO> selectCinemas(String cinemaId){
		LOGGER.debug("셀렉트 영화관들");
		List<CinemaVO> result = sqlSession.selectList("cinema.selectCinemas", cinemaId);
		return result;
	}

	public CinemaVO selectCinema(String cinemaId) {
		LOGGER.debug("상세보기");
		return sqlSession.selectOne("cinema.selectCinema", cinemaId);

	}
}
