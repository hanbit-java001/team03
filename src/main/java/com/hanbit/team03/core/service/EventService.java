package com.hanbit.team03.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.team03.core.dao.EventDAO;
import com.hanbit.team03.core.vo.EventVO;

@Service
public class EventService {

   @Autowired
   private EventDAO eventDAO;

   public List<EventVO> getEvents(){
      return eventDAO.selectEvents();
   }

   public EventVO getEventDetails(int eventId){
      return eventDAO.selectEventDetails(eventId);
   }
}