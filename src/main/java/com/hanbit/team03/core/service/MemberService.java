package com.hanbit.team03.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanbit.team03.core.dao.MemberDAO;
import com.hanbit.team03.core.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;

	PasswordEncoder encoder = new StandardPasswordEncoder();

	@Autowired
	private SecurityService securityService;


	@Transactional
	public String joinMember(MemberVO member) {
		int countMember = memberDAO.countMember(member.getEmail());

		if (countMember > 0) {
			throw new RuntimeException("이미 가입된 이메일입니다.");
		}

		int memberId = memberDAO.selectNextMemberId();
		member.setMemberId(memberId);

		String encryptedPassword = securityService.encryptPassword(member.getPassword());
		member.setPassword(encryptedPassword);

		memberDAO.insertMember(member);

		return member.getName();
	}

}
