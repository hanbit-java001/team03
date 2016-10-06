package com.hanbit.team03.core.session;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.hanbit.team03.core.session.Session;
import com.hanbit.team03.core.session.SessionHelper;

public class SessionHelper {

	private static SessionHelper sessionHelper;

	@Autowired
	private ApplicationContext applicationContext;

	@PostConstruct
	public void setSessionHelper() {
		sessionHelper = this;
	}

	private <T> T getBean(Class<T> clazz) {
		return applicationContext.getBean(clazz);
	}

	public static Session getSession() {
		return sessionHelper.getBean(Session.class);
	}
}
