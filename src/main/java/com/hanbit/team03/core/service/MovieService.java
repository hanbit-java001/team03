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


	// 영화하고 이미지 불러오기
	public List<MovieVO> getMovies(){
		return movieDAO.selectMovies();
	}

	public List<MovieVO> getMovieNameId(){
		return movieDAO.selectMovies();

	}

	// 영화 상세보기
	public MovieVO getMovieDetails(int movieId){
		return movieDAO.selectMovieDetails(movieId);
	}

}
