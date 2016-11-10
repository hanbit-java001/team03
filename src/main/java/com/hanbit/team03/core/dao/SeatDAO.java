package com.hanbit.team03.core.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.SeatVO;
import com.hanbit.team03.core.vo.SelectCountReservedSeatVO;

@Repository
public class SeatDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReserveMovieDAO.class);

	@Autowired
	private SqlSession sqlSession;


	public List<SeatVO> selectTotalSeatInfo(String timeId, int theaterId){
		Map params = new HashMap();
		params.put("timeId", timeId);
		params.put("theaterId", theaterId);
		List<SeatVO> result = sqlSession.selectList("selectTotalSeatInfo", params);
		return result;
	}

	public List<SeatVO> selectReservedSeatInfo(String timeId, int theaterId){
		Map params = new HashMap();
		params.put("timeId", timeId);
		params.put("theaterId", theaterId);
		List<SeatVO> result = sqlSession.selectList("selectReservedSeatInfo", params);
		return result;
	}

}
