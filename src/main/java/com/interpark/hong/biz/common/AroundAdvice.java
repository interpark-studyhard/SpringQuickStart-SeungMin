package com.interpark.hong.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {

	@Pointcut("execution(* com.interpark.hong.biz..*Impl.*(..))")
	public void allPointcut() {
	}

	@Around("allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {

		String method = pjp.getSignature().getName();

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		Object returnedObj = pjp.proceed();

		stopWatch.stop();

		System.out.println("allPointcut|advise : aroud(method:" + method + ")(processTime:"+ stopWatch.getTotalTimeMillis() + ")");

		return returnedObj;
	}
}
