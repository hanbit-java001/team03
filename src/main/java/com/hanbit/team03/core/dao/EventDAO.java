package com.hanbit.team03.core.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.team03.core.vo.EventVO;
import com.hanbit.team03.core.vo.MovieVO;

@Repository
public class EventDAO {

   private static final Logger LOGGER = LoggerFactory.getLogger(EventDAO.class);

   @Autowired
   private SqlSession sqlSession;

   public List<EventVO> selectEvents(){
      LOGGER.debug("이벤트 이미지 불러오기");
      List<EventVO> result = sqlSession.selectList("event.selectEvents");
      return result;
   }

   public EventVO selectEventDetails(int eventId) {
      LOGGER.debug("이벤트 상세보기");
      return sqlSession.selectOne("event.selectEventDetails", eventId);

   }

}