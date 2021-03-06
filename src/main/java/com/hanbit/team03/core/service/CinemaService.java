package com.hanbit.team03.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.team03.core.dao.CinemaDAO;
import com.hanbit.team03.core.vo.CinemaVO;

@Service
public class CinemaService {

	@Autowired
	private CinemaDAO cinemaDAO;

		// 영화관 이름 한 개씩 가져오기
		public List<CinemaVO> getCinemas(){
			return cinemaDAO.selectCinemas();
		}

		public List<CinemaVO> getCinemaNameId(){
			return cinemaDAO.selectCinemaNameId();
		}

		// 영화관 상세보기
		public CinemaVO getCinemaDetail(int cinemaId) {
			return cinemaDAO.selectCinema(cinemaId);
		}
}
