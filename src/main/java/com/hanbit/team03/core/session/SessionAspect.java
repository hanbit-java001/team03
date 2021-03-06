package com.hanbit.team03.core.session;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SessionAspect {

   private static final Logger LOGGER = LoggerFactory.getLogger(SessionAspect.class);

   @Around("@annotation(com.hanbit.team03.core.session.LoginRequired)")
   public Object checkLogin(ProceedingJoinPoint pjp) throws Throwable {
      Session session = SessionHelper.getSession();

      if (session.isLoggedIn()) {
         return pjp.proceed();
      }

      MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
      Class returnType = methodSignature.getReturnType();

      if (returnType == String.class) {
         return "login";
      }

      throw new RuntimeException("로그인이 필요합니다.");
   }

}