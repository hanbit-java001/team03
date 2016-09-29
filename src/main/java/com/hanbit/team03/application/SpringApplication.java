package com.hanbit.team03.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

import com.hanbit.team03.core.service.ReserveMovieService;
import com.hanbit.team03.core.vo.ReserveMovieVO;

public class SpringApplication {

	public static void main(String[] args) {
		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.xml");

			ApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("spring/applicationContext-core.xml", "spring/applicationContext-dao.xml");

			ReserveMovieService reserveMovieService = applicationContext.getBean(ReserveMovieService.class);

			ReserveMovieVO reserveMovie = new ReserveMovieVO();
			reserveMovie.setReserveId(1);
			reserveMovie.setSeatId(1);
			reserveMovie.setTheaterId(1);
			reserveMovie.setTimeId("1");
			reserveMovie.setMemberId(1);

			int result = reserveMovieService.reserveMovie(reserveMovie);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
