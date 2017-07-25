package com.interpark.hong.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {

	@Pointcut("execution(* com.interpark.hong..*Impl.*(..))")
	public void allPointcut() {
	}

	@Pointcut("execution(* com.interpark.hong..*Impl.get*(..))")
	public void getPointcut() {
	}
}