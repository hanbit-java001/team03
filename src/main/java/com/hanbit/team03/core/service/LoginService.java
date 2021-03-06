package com.hanbit.team03.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hanbit.team03.core.dao.MemberDAO;
import com.hanbit.team03.core.vo.MemberVO;

@Service
public class LoginService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityService.class);

	@Autowired
	private MemberDAO memberDAO;

	private static PasswordEncoder encoder = new BCryptPasswordEncoder(4);

	public String encryptPassword(String password) {
		return encoder.encode(password);
	}

	public boolean matchPassword(String rawPassword, String encryptedPassword) {
		return encoder.matches(rawPassword, encryptedPassword);
	}

	public MemberVO insertMember(MemberVO member){

		int result = memberDAO.insertMember(member);
		return member;
	}

	public MemberVO getValidMember(String email, String password) {
		MemberVO member = memberDAO.selectMember(email);

		if (member == null) {
			throw new RuntimeException("가입되지 않은 이메일입니다.");
		}

		String encryptedPassword = member.getPassword();

		if (!matchPassword(password, encryptedPassword)) {
			throw new RuntimeException("패스워드가 일치하지 않습니다.");
		}

		return member;
	}

}
