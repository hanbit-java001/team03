package com.hanbit.team03.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopmenuController {

	@RequestMapping("/topmenu/menu")
	public String topMenu(Model model) {

		return "topmenu/menu";
	}

	

}