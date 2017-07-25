package com.interpark.hong.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {

	@Pointcut("execution(* com.interpark.hong..*Impl.*(..))")
	public void allPointcut() {
	}

	@AfterThrowing(pointcut = "allPointcut()", throwing = "thrownObj")
	public void exceptionLog(JoinPoint jp, Exception thrownObj) {
		String method = jp.getSignature().getName();
		System.out.println("allPointcut|advise : @AfterThrowing(method:" + method + ")(exception:" + thrownObj.getMessage() + ")");
	}
}
