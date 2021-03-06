package com.hanbit.team03.core.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.MovieVO;

@Repository
public class MovieDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReserveMovieDAO.class);

	@Autowired
	private SqlSession sqlSession;


	public List<MovieVO> selectMovies(){
		LOGGER.debug("셀렉트 영화와 이미지와 파일");
		List<MovieVO> result = sqlSession.selectList("movie.selectMovieFile");

		return result;
	}

	public List<MovieVO> selectMoviesNameId(){
		LOGGER.debug("셀렉트 영화와 이미지");
		List<MovieVO> result = sqlSession.selectList("movie.selectMoviesNameId");

		return result;
	}



	public MovieVO selectMovieDetails(int movieId) {
		LOGGER.debug("특정 영화 상세보기");
		return sqlSession.selectOne("movie.selectMovieDetails", movieId);

	}
}
