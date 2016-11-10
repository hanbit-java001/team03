package com.hanbit.team03.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.service.EventService;
import com.hanbit.team03.core.vo.EventVO;

@Controller
public class EventBoardController {

   private static final Logger LOGGER = LoggerFactory.getLogger(EventBoardController.class);

   @Autowired
   private EventService eventService;

   @RequestMapping("/event")
   public String list() {

      return "event/eventBoard";
   }

   @RequestMapping(value="/api/event/list", method=RequestMethod.GET)
   @ResponseBody
   public List<EventVO> getEvents(){
      return eventService.getEvents();
   }

   @RequestMapping(value="/api/event/detail", method=RequestMethod.GET)
   @ResponseBody
   public EventVO getEventDetails(@RequestParam("eventId") int eventId){
      EventVO result = eventService.getEventDetails(eventId);
      return result;
   }

}