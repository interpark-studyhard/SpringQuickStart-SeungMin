package com.interpark.hong.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service
@Aspect
public class LogAdvice {

	@Pointcut("execution(* com.interpark.hong..*Impl.*(..))")
	public void allPointcut() {}

	@Pointcut("execution(* com.interpark.hong..*Impl.get*(..))")
	public void getPointcut() {}

	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		System.out.println("allPointcut|advise : before");
	}
}
