package com.hanbit.team03.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.team03.core.dao.ReserveMovieDAO;
import com.hanbit.team03.core.vo.ReserveMovieVO;
import com.hanbit.team03.core.vo.SelectDataVO;

@Service
public class ReserveMovieService {

	@Autowired
	private ReserveMovieDAO reserveMovieDAO;

	public int reserveMovie(ReserveMovieVO reserveMovieVO){

		int resultReservation = reserveMovieDAO.insertReservation(reserveMovieVO);

		if(resultReservation <= 0){
			throw new RuntimeException("예매가 정상적으로 이루어지지 않았습니다.");
		}

		return reserveMovieVO.getReserveId();
	}


	public int removeReservation(int reserveId){
		int resultRemoveReservation = reserveMovieDAO.deleteReservation(reserveId);

		if(resultRemoveReservation <= 0){
			throw new RuntimeException("예매취소가 정상적으로 이루어지지 않았습니다.");
		}

		return reserveId;
	}


	public List<ReserveMovieVO> getReservations(String userId){

		return reserveMovieDAO.selectReservations(userId);

	}


	public SelectDataVO getDetailReservation(int reserveId){

		return reserveMovieDAO.selectReservation(reserveId);
	}
}
