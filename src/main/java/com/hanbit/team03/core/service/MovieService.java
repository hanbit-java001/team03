package com.hanbit.team03.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.team03.core.dao.MovieDAO;
import com.hanbit.team03.core.vo.MovieVO;

@Service
public class MovieService {

	@Autowired
	private MovieDAO movieDAO;


	// 영화 제목 한 개씩 가져오기
	public List<MovieVO> getMovies(){
		return movieDAO.selectMovies();
	}

	// 영화 상세보기
	public MovieVO getMovieDetails(String movieId){
		return movieDAO.selectMovieDetails(movieId);
	}

}
