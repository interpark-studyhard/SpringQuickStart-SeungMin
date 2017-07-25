package com.interpark.hong.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import com.interpark.hong.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {

	@AfterReturning(pointcut = "PointcutCommon.getPointcut()", returning = "returnedObj")
	public void afterLog(JoinPoint jp, Object returnedObj) {

		String method = jp.getSignature().getName();

		if (returnedObj instanceof UserVO) {
			UserVO user = (UserVO) returnedObj;
			if (user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " login(Admin)");
			}
		}
		System.out.println("allPointcut|advise : @@AfterReturning(method:" + method + ")(return:" + returnedObj.toString() + ")");
	}
}
