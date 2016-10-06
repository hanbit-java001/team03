package com.hanbit.team03.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("main/main")
	public String main(Model model) {

		return "main/main";

}
}

