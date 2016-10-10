package com.hanbit.team03.core.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.MovieFilesVO;


@Repository
public class Movie_FilesDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReserveMovieDAO.class);

	@Autowired
	private SqlSession sqlSession;


	public List<MovieFilesVO> selectMovies(){
		LOGGER.debug("셀렉트 영화들");
		List<MovieFilesVO> result = sqlSession.selectList("movie.selectMovieFile");

		return result;
	}


}
