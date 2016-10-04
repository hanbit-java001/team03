package com.hanbit.team03.application;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

import com.hanbit.team03.core.service.ReserveMovieService;
import com.hanbit.team03.core.vo.ReserveDataListVO;
import com.hanbit.team03.core.vo.ReserveDetailDataVO;
import com.hanbit.team03.core.vo.ReserveMovieVO;

public class SpringApplication {

	public static void main(String[] args) {
		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.xml");

			ApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("spring/applicationContext-core.xml", "spring/applicationContext-dao.xml");

			ReserveMovieService reserveMovieService = applicationContext.getBean(ReserveMovieService.class);


			 List<ReserveDataListVO> reserveMovieVO = reserveMovieService.getReservations("1");

			 for(ReserveDataListVO t : reserveMovieVO ){
				 System.out.println(t.getMovieName());
			 }
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
