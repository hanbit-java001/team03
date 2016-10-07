package com.hanbit.team03.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventBoardController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);


	@RequestMapping("/event")
	public String list() {

		return "event/eventBoard";
	}

}
