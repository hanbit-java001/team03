package com.hanbit.team03.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.team03.core.service.MemberService;
import com.hanbit.team03.core.vo.MemberVO;

@Controller
public class MemberController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService memberService;

	@RequestMapping("/member/join")
	public String join(){
		return "member/join";
	}

	@RequestMapping("/member/login")
	public String login(){
		return "member/login";
	}

	@RequestMapping("/member/findAccount")
	public String findAccount(){
		return "member/findAccount";
	}

	@RequestMapping("reservation/reservationList")
	public String goToSeatReservationListPage(Model model) {
		return "member/reservationList";
	}

	@RequestMapping(value="/api/member/join", method=RequestMethod.POST)
	@ResponseBody
	public Map doJoin(HttpServletRequest request) throws Exception {
		System.out.println("여기");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			MemberVO member = new MemberVO();
			member.setName(name);
			member.setEmail(email);
			member.setPassword(password);
			memberService.joinMember(member);
		}
		catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}

		Map result = new HashMap();
		result.put("name", name);

		return result;
	}
}
