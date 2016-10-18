package com.hanbit.team03.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.team03.core.dao.MovieScheduleDAO;
import com.hanbit.team03.core.dao.ReserveMovieDAO;
import com.hanbit.team03.core.vo.ReserveMovieVO;
import com.hanbit.team03.core.vo.SelectCountReservedSeatVO;
import com.hanbit.team03.core.vo.ReserveDataListVO;
import com.hanbit.team03.core.vo.ReserveDetailDataVO;

@Service
public class ReserveMovieService {

	@Autowired
	private ReserveMovieDAO reserveMovieDAO;

	@Autowired
	private MovieScheduleDAO movieScheduleDAO;

	//예매하기
	public int reserveMovie(ReserveMovieVO reserveMovie){
		int resultReservation = reserveMovieDAO.insertReservation(reserveMovie);
		if(resultReservation <= 0){
			throw new RuntimeException("예매가 정상적으로 이루어지지 않았습니다.");
		}
		return reserveMovie.getReserveId();
	}

//	//예매하기 위해서 사용자가 선택한 ID들 가지고 ReserveMovieVO완성하기위해 select
//	public ReserveMovieVO getReserveProperties(String movieName, String cinemaName, String theater, String seatNumber){
//		ReserveMovieVO result = reserveMovieDAO.selectReserveProperties(movieName, cinemaName, theater, seatNumber);
//		return null;
//	}


	//예매취소
	public int removeReservation(int reserveId){
		int resultRemoveReservation = reserveMovieDAO.deleteReservation(reserveId);
		if(resultRemoveReservation <= 0){
			throw new RuntimeException("예매취소가 정상적으로 이루어지지 않았습니다.");
		}
		return reserveId;
	}

	//예약한 전체 리스트 보여주기
	public List<ReserveDataListVO> getReservations(String userId){
		return reserveMovieDAO.selectReservations(userId);
	}

	//예약한 한건에 대해서 자세한 내용 보여주기
	public ReserveDetailDataVO getDetailReservation(int reserveId){
		System.out.println(reserveMovieDAO.selectReservation(reserveId));
		return reserveMovieDAO.selectReservation(reserveId);
	}

	//THEATER_ID, THEATER_NAME, START_TIME, TOTAL_SEAT, TIME_ID, RESERVED_SEAT 반환
	public List<SelectCountReservedSeatVO> selectCountReservedSeat(int movieId, int cinemaId){
		return movieScheduleDAO.selectCountReservedSeat(movieId, cinemaId);
	}
}
