package com.hanbit.team03.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("/movie/main")
	public String movie(Model model) {

		return "movie/main";
	}



}